package ArraysPractice;

public class MergeTwoSortedArrayJava {

//    Input: arr1[] = [1, 3, 4, 5], arr2[] = [2, 4, 6, 8]
//    Output: arr1[] = [1, 2, 3, 4], arr2[] = [4 5, 6, 8]
//    Explanation: Combined sorted array = [1, 2, 3, 4, 4, 5, 6, 8], array arr1[]
//    contains smallest 4 elements: 1, 2, 3, 4, and array arr2[] contains the remaining 4 elements: 4, 5, 6, 8.
    public static void main(String[] args) {
        int[] arr1 = {1, 3, 4, 5};
        int[] arr2 = {2, 4, 6, 8};
        mergeTwoSortedArray(arr1, arr2);
    }

    private static void mergeTwoSortedArray(int[] arr1, int[] arr2) {
        int[] arr3 = new int[arr1.length + arr2.length];
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                arr3[k] = arr1[i];
                k++;
                i++;
            } else {
                arr3[k] = arr2[j];
                k++;
                j++;
            }
        }
        while (i < arr1.length) {
            arr3[k] = arr1[i];
            i++;
            k++;
        }
        while (j < arr2.length) {
            arr3[k] = arr2[j];
            j++;
            k++;
        }
        for (int value : arr3) {
            System.out.print(value);
        }
    }
}
