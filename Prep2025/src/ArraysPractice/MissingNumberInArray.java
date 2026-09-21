package ArraysPractice;

public class MissingNumberInArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5, 6};
        int n = 6; // since numbers are from 1 to 6
        // output should be 4 since 4 is missing in the array
        int missingNumber = findMissingNumberUsingBruteForce(arr, n);
        System.out.println("The missing number in the array is: " + missingNumber);
        System.out.println("Time Complexity: O(n) and Space Complexity: O(n) because we are using extra space for boolean array..!!");
        System.out.println();
        System.out.println("Finding missing number using optimal approach: ");
        int missingNumberOptimal = findMissingNumberUsingOptimalApproach(arr, n);
        System.out.println("The missing number in the array is: " + missingNumberOptimal);
        System.out.println("Time Complexity: O(n) and Space Complexity: O(1) since we are not using any extra space..!!");
        System.out.println();
        System.out.println("Finding missing number using XOR approach: ");
        int missingNumberXOR = findMissingNumberUsingXOR(new int[]{1, 2, 3, 5, 6});
        System.out.println("The missing number in the array is: " + missingNumberXOR);
        System.out.println("Time Complexity: O(n) and Space Complexity: O(1) since we are not using any extra space..!!");
        System.out.println();
     }

    private static int findMissingNumberUsingXOR(int[] arr) {
        int n = arr.length + 1; // since one number is missing
        int xorFull = 0;
        int xorArr = 0;
        // xor of all numbers from 1 to n
        for (int i = 1; i <= n; i++) {
            xorFull = xorFull ^ i;
        }
        // xor of all elements in the array
        for (int i = 0; i < arr.length; i++) {
            xorArr = xorArr ^ arr[i];
        }

        // returning the missing number
        return xorFull ^ xorArr;

    }

    private static int findMissingNumberUsingOptimalApproach(int[] arr, int n) {
        // using sum formula to find the missing number
        int sum = n * (n + 1) / 2; // sum of first n natural numbers
        int arrSum = 0;

        for (int i = 0; i < arr.length; i++) {
            arrSum += arr[i];
        }
        return sum - arrSum;

    }

    private static int findMissingNumberUsingBruteForce(int[] arr, int n) {
        // This is brute force Solution
        boolean present[] = new boolean[n + 1]; // default value is false
        for (int i = 0; i < arr.length; i++) {
            present[arr[i]] = true;
        }

        for (int i = 1; i <= n; i++) {
            if (!present[i]) {
                return i;
            }

        }
        return -1;

    }
}
