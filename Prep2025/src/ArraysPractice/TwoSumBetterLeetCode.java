package ArraysPractice;

import java.util.HashMap;

public class TwoSumBetterLeetCode {


    public static void main(String[] args) {


//        Input: nums = [2,7,11,15], target = 9
//        Output: [0,1]
//        Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
//        Example 2:
//
//        Input: nums = [3,2,4], target = 6
//        Output: [1,2]
//        Example 3:
//
//        Input: nums = [3,3], target = 6
//        Output: [0,1]

        int arr[] = {2,7,11,15};
        int target = 9;
        int result [] = twoSum(arr, target);
        System.out.println("Indices are: [" + result[0] + ", " + result[1] + "]");

    }
    public static int[] twoSum(int[] nums, int target) {
        // Storing values and their indices in HashMap
        HashMap<Integer , Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            // finding complement
            int complement = target - nums[i];
            // checking if complement is already present in map
            if(map.containsKey(complement))
            {
                // if present return indices
                return new int [] {map.get(complement), i};
            }

         // else put the value and its index in map
            map.put(nums[i], i);
        }

        return new int[]{};
    }
}
