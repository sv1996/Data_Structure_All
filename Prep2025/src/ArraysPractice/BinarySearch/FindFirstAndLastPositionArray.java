package ArraysPractice.BinarySearch;

public class FindFirstAndLastPositionArray {
    public static void main(String[] args) {
//        Input : arr[] = [1, 3, 5, 5, 5, 5, 67, 123, 125], x = 5
//        Output : [2, 5]
//        Explanation: First occurrence of 5 is at index 2 and last occurrence of 5 is at index 5
        int[] arr = {1, 3, 5, 5, 5, 5, 67, 123, 125};
        int index = 5;
        int firstOccurrence = getFirstClearance(arr, index);
        System.out.println("First Occurance of target Number --->" + firstOccurrence);
        int lastOccurance = getLastOccurrence(arr, index);
        System.out.println("Last Occurance of target Number --->" + lastOccurance);
    }
    private static int getFirstClearance(int[] arr, int index) {
        int first = -1;
        // search on left
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == index) {
                first = mid;
                high = mid - 1; // search left
            } else if (arr[mid] > index) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return first;
    }
    private static int getLastOccurrence(int[] arr, int index) {
        // we will use binary search here
        int last = -1;
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == index) {
                last = mid;
                low = mid + 1;  // search on right
            } else if (arr[mid] < index) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return last;
    }
}
