package ArraysPractice;

public class MaximumProductSubArray {
    public static void main(String[] args) {
//        Given an integer array nums, find a subarray that has the largest product, and return the product.
//
//                The test cases are generated so that the answer will fit in a 32-bit integer.
//
//                Note that the product of an array with a single element is the value of that element.

        int[] nums = {2, 3, -2, 4};
        // output will be 6 because the subarray [2, 3] has the largest product
        System.out.println("Maximum Product SubArray is " + maxProduct(nums));
    }

    private static String maxProduct(int[] nums) {
        // optimized solution with O(n) time complexity and O(1) space complexity
        int maxProduct = nums[0];
        int minProduct = nums[0];
        int result = nums[0];
        return null;


    }
}
