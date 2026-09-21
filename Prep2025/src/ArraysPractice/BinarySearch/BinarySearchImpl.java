package ArraysPractice.BinarySearch;

public class BinarySearchImpl {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int target = 5;

        int ans = getIndexNumber(array, target);

        System.out.println("Indexed of target Number" + ans);

        int ansOfIndex = getBinarySearchUsingRecursion(array, 0, array.length - 1, target);
        System.out.println("Indexed of target Number" + ansOfIndex);


    }

    private static int getBinarySearchUsingRecursion(int[] array, int low, int high, int target) {
        if (low > high) return -1;

        if (low <= high) {

            int mid = low + (high - low) / 2;

            if (array[mid] == target) return mid;
            if (array[mid] > target) {
                // searching left side
                return getBinarySearchUsingRecursion(array, low, mid - 1, target);
            } else {
                // searching right side
                return getBinarySearchUsingRecursion(array, mid + 1, high, target);
            }

        }


        return -1;

    }

    private static int getIndexNumber(int[] array, int target) {
        // we will apply binary search
        int low = 0;
        int high = array.length - 1;
        while (low <= high) {

            int mid = low + (high - low) / 2;
            if (array[mid] == target) {
                return mid;
            }
            if (array[mid] > target) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }

        }

        return -1;


    }
}
