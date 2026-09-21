package ArraysPractice.BinarySearch;

public class FindPeakElement {
    public static void main(String[] args) {
        // A peak element is an element that is strictly greater than its neighbors.
        int arr[] = {1, 2, 3, 1};
        // here answer is 3
        int index = getPeakElementUsingLinearSearch(arr);
        System.out.println("Peak Element is at index " + index);
        int indexBinarySearch = getPeakElementUsingBinarySearch(arr);
        System.out.println("Peak Element is at index " + indexBinarySearch);

    }

    private static int getPeakElementUsingBinarySearch(int[] arr) {
        int low = 0;
        int high = arr.length - 1;
        while (low < high) {
            int mid  =  low + (high -low) /2;
            if (arr[mid] < arr[mid + 1]) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }
        return low;
        // why returning low because when low == high then we have found the peak element
    }

    private static int getPeakElementUsingLinearSearch(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return i;
            }
        }
        return arr.length - 1;
        // why array is strictly increasing then the last element will be the peak element
    }


}
