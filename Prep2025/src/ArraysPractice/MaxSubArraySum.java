package ArraysPractice;

public class MaxSubArraySum {
    public static void main(String[] args) {
//        Given an integer array arr[], find the subarray (containing at least one element) which has the maximum possible sum, and return that sum.
//                Note: A subarray is a continuous part of an array.
//
//                Examples:
//
//        Input: arr[] = [2, 3, -8, 7, -1, 2, 3]
//        Output: 11
//        Explanation: The subarray [7, -1, 2, 3] has the largest sum 11.
//
//        Input: arr[] = [-2, -4]
//        Output: -2
//        Explanation: The subarray [-2] has the largest sum -2.
//
//        Input: arr[] = [5, 4, 1, 7, 8]
//        Output: 25
//        Explanation: The subarray [5, 4, 1, 7, 8] has the largest sum 25.


        int[] arr = {-2, -4};
        System.out.println("Maximum Subarray Sum: " + maxSubArraySumUsingTraversalMethod(arr));
        System.out.println("Maximum Subarray Sum using Kaaden's Algorithms: " + maxSubArraySumUsingKadensAlgorithms(arr));

    }

    private static int maxSubArraySumUsingKadensAlgorithms(int[] arr) {
        // Approach: Kadane's Algorithm
        int maxSoFar = arr[0];
        int maxEndingHere = arr[0];

        for (int i = 1; i < arr.length; i++) {
            maxEndingHere = Math.max(arr[i], maxEndingHere + arr[i]);
            maxSoFar = Math.max(maxSoFar, maxEndingHere);
        }

        return maxSoFar;
    }

    private static int maxSubArraySumUsingTraversalMethod(int[] arr) {
        // Approach: Traversal Method native approach
        // finding all subArrays and calculating their sums
        int res = arr[0];
        for (int i = 0; i < arr.length; i++) {
            int currentSum = 0;
            for (int j = i; j < arr.length; j++) {
                currentSum += arr[j];
                res = Math.max(res, currentSum);

            }
        }
        return res;
    }
}
