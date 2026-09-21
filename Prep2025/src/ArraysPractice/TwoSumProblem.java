package ArraysPractice;

import java.util.HashMap;

public class TwoSumProblem {


    public static void main(String[] args) {
        // given arrays.  return indices of two numbers such that they add up to a specific target
        int[] arr = {1, 2, 3, 4, 7, 9, 11, 15};
        int target = 10;
        System.out.println("Brute Force Approach:");
        printTwoSumBruteForce(arr, target);
        System.out.println("Optimized Approach: using two poi nter technique");
        printTwoSumOptimized(arr, target);
        System.out.println("Solving using HashMap:");
        printTwoSumUsingHashMap(arr, target);
        System.out.println("Time Complexity: O(n)");
        System.out.println("Last Approach");
        int[] nums = {2, 7, 11, 15};
        int target1 = 9;
        int[] ansMap = printTwoSumUsingHashMapMostOptimized(nums, target1);
        for (int i = 0; i < ansMap.length; i++) {
            System.out.print(ansMap[i] + " ");
        }

    }

    private static int[] printTwoSumUsingHashMapMostOptimized(int[] arr, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int complement = target - arr[i];

            if (map.containsKey(complement)) {
                // we have found the pair
                return new int[]{map.get(complement), i};
            }
            map.put(arr[i], i);

        }
        return null;

    }

    private static void printTwoSumUsingHashMap(int[] arr, int target) {

        // creating a map for storing values and their indices
        HashMap<Integer, Integer> map = new HashMap<>();
        boolean found = false;

        // Iterating over the array
        for (int i = 0; i < arr.length; i++) {
            int complement = target - arr[i];
            if (map.containsKey(complement)) {
                System.out.println("Indices are : " + map.get(complement) + " and " + i);
                return;
            } else {
                map.put(arr[i], i);
            }
        }

        if (!found) {
            System.out.println(" No two sum solution found");

        }

    }

    private static void printTwoSumOptimized(int[] arr, int target) {
        // using two pointer approach
        int left = 0;
        int right = arr.length - 1;
        boolean found = false;
        while (left < right) {
            // using two pointer approach
            int sum = arr[left] + arr[right];
            if (sum == target) {
                // print indices
                System.out.println("Indices are : " + left + " and " + right);
                found = true;
                break;
            } else if (sum > target) {
                right--;
            } else {
                left++;
            }
        }

        if (!found) {

            System.out.println(" No two sum solution found");
        }


    }

    private static void printTwoSumBruteForce(int[] arr, int target) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    System.out.println("Indices are: " + i + " and " + j);

                }
            }
        }

    }


}

