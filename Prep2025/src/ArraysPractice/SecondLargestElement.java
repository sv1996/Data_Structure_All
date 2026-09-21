package ArraysPractice;

import java.util.Arrays;

public class SecondLargestElement {

    public static void main(String[] args) {
        int[] arr = {12, 35, 1, 10, 34, 1};
        // finding second larget element using sorting
//        Arrays.sort(arr);
//        System.out.println("Second largest element is: " + arr[arr.length - 2]);

        // finding second largest element without sorting using two pass
        int ans = secondLargetUsingTwoPass(arr);
        System.out.println("Second largest element using two pass is: " + ans);
        System.out.println("Second largest element using Optimal Approach is with Time Complexity o(n) " + secondLargestMostOptimizedUsingSinglePass(arr));


    }

    private static int secondLargestMostOptimizedUsingSinglePass(int[] arr) {
        if (arr.length < 2) {
            return -1;
        }

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            } else if (arr[i] != largest && arr[i] > secondLargest) {
                secondLargest = arr[i];
            }


        }


        return secondLargest == Integer.MIN_VALUE ? -1 : secondLargest;

    }

    private static int secondLargetUsingTwoPass(int[] arr) {
        int largest = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }

        int secondLargest = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != largest) {
                secondLargest = Math.max(arr[i], secondLargest);
            }
        }


        return secondLargest;
    }
}
