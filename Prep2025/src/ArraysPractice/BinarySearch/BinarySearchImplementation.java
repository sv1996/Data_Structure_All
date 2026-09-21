package ArraysPractice.BinarySearch;
public class BinarySearchImplementation {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int target = 5;
        int resultIndex = binarySearchClassicApproach(array, target);
        String ans = resultIndex != -1 ? "Element found at index: " + resultIndex : "Element not found in the array.";
        System.out.println(ans);
        System.out.println("Using Recursive Approach:");
        int resultIndexRecursive = binarySearchRecursiveApproach(array, 0, array.length - 1, target);
        String ansRecursive = resultIndexRecursive != -1 ? "Element found at index: " + resultIndexRecursive : "Element not found in the array.";
        System.out.println(ansRecursive);

    }
    private static int binarySearchRecursiveApproach(int[] array, int low, int high, int target) {
        if (low <= high)
        {
            // to avoid overflow
            int midIndex = low + (high - low) / 2;
            if (array[midIndex] == target) {
                return midIndex;
            }
            // search in left half
            if (array[midIndex] > target) {
                return binarySearchRecursiveApproach(array, low, midIndex - 1, target);
            } else {
                // search in right half
                return binarySearchRecursiveApproach(array, midIndex + 1, high, target);
            }
        }
        return -1;
    }

    private static int binarySearchClassicApproach(int[] array, int target) {
        int startIndex = 0;
        int endIndex = array.length - 1;
        while (startIndex <= endIndex) {
            // to avoid overflow
            int midIndex = startIndex + (endIndex - startIndex) / 2;
            if (array[midIndex] == target) {
                return midIndex;
            }
            // search in left half
            if (array[midIndex] > target) {
                endIndex = midIndex - 1;
            } else {
                // search in right half
                startIndex = midIndex + 1;
            }

        }
        return -1;
    }


}
