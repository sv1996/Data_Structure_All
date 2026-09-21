package ArraysPractice;

public class LeftRotateArrayByDPlaces {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int d = 3;
        // output will be {3,4,5,6,7,1,2} since we have rotated left by d places
          leftRotateArrayByDPlaces(arr, d);
          System.out.println("Time Complexity: O(n) and Space Complexity: O(1) since we are not using any extra space..!!");
//        System.out.println("Right Rotation by d places:");
//        rightRotateArrayByDPlaces(arr, d);
    }

    private static void rightRotateArrayByDPlaces(int[] arr, int d) {
        int n = arr.length;
        d = d % n; // in case d is greater than n
        // right rotation by d places is equivalent to left rotation by n-d places
        leftRotateArrayByDPlaces(arr, n - d);
    }

    private static void leftRotateArrayByDPlaces(int[] arr, int d) {
        // I am using the reversal algorithm to solve this problem
        int n = arr.length;
        d = d % n; // in case d is greater than n

        // step1 : reverse the first d elements
        reverseArray(arr, 0, d - 1);
        // step2  reverse the remaining n-d elements
        reverseArray(arr, d, n - 1);
        // step3 : reverse the whole array
        reverseArray(arr, 0, n - 1);
        System.out.println("Array after left rotation by " + d + " places: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }


    public static void reverseArray(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
