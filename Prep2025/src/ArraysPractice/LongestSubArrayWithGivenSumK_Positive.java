package ArraysPractice;

public class LongestSubArrayWithGivenSumK_Positive {

    public static void main(String[] args) {
        int[] arr = {10, 5, 2, 7, 1, 9};
        int k = 15;
        // output will be 4 as the longest sub-array with sum 15 is {5, 2, 7, 1}
        int maxLength = findLongestSubArrayWithSumKBruteForceApproach(arr, k);
        System.out.println("The length of the longest sub-array with sum " + k + " is: " + maxLength);
        System.out.println("Time complexity: O(n^3) and Space Complexity: O(1) since we are not using any extra space..!!");
        System.out.println();
        System.out.println("Using optimized approach with Sliding Window: ");
     //   int maxLengthOptimized = findLongestSubArrayWithSumKOptimizedApproach(arr, k);
     //   System.out.println("The length of the longest sub-array with sum " + k + " is: " + maxLengthOptimized);

    }

//    private static int findLongestSubArrayWithSumKOptimizedApproach(int[] arr, int sum) {
//
//
//
//    }

    private static int findLongestSubArrayWithSumKBruteForceApproach(int[] arr, int sum) {
        // using two loops - Brute Force Approach
        int n = arr.length;
        int maxLength = 0;
        for (int i = 0; i < n; i++) {

            for (int j = i; j < n; j++) {
                int currentSum = 0;

                for (int k = i; k <= j; k++) {
                    currentSum += arr[k];
                }
                if(currentSum ==sum)
                {
                    int currentLength = j - i + 1;
                    if(currentLength> maxLength)
                    {
                        maxLength = currentLength;
                    }
                }
            }
        }
        return maxLength;
//        int maxLength = 0;
//        for (int i = 0; i < nums.length; i++) {
//            int sum = 0;
//            for (int j = i; j < nums.length; j++) {
//                sum += nums[j];
//                if (sum == k) {
//                    maxLength = Math.max(maxLength, j - i + 1);
//                }
//            }
//        }
//        return maxLength;
    }
}
