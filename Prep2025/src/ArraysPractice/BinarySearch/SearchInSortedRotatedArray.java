package ArraysPractice.BinarySearch;

public class SearchInSortedRotatedArray {
    public static void main(String[] args) {
        // we have to search for an element in a sorted rotated array
        int[] arr = {4, 5, 6, 7, 0, 1, 2};
        int target = 0;
        // output will be 4 because 0 is at index 4
        System.out.println("Element is at index " + searchInSortedRotatedArray(arr, target));}
    private static int searchInSortedRotatedArray(int[] arr, int target) {
        // using modified binary search we can find the target element in O(log n) time complexity
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (target == arr[mid]) {
                return mid;}
            // if left half is sorted
            if (arr[mid] >= arr[low]) {
                // if key is in the left half
                if (target >= arr[low] && target < arr[mid]) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }}
            // if right half is sorted
            else {
                // if key is in the right half
                if (target > arr[mid] && target <= arr[high]) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }}}
        // key is not found
        return -1;}
}
