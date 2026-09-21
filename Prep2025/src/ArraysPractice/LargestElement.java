package ArraysPractice;


import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class LargestElement {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0,98,11,34,56,23,89};
        int largest = findLargestElement(arr);
        System.out.println("Largest element in the array is: " + largest);
        System.out.println("Time Complexity: O(n)");
        System.out.println("Largest elemeent Using Stream API: " + findLargestUsingStream(arr));
        System.out.println("Time complexity using Stream API: O(n)");

    }

    private static Integer findLargestUsingStream(int[] arr) {

        List<Integer> list = Arrays.stream(arr).boxed().toList();
        return list.stream().max(Integer::compareTo).get();

    }

    private static int findLargestElement(int[] arr) {
        int larget = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > larget) {
                larget = arr[i];
            }
        }

        return larget;
    }

}
