package ArraysPractice;

import java.util.Arrays;
import java.util.HashSet;

public class LongestConsecutiveSubsequence {

    public static void main(String[] args) {
        int[] arr = {1, 9, 3, 10, 4, 20, 2};
        // output will be 4 because the longest consecutive subsequence is 1,2,3 and 4
        System.out.println("Longest Consecutive Subsequence is " + longestConsecutiveSubsequence(arr));
        // using set data structure
        System.out.println("Longest Consecutive Subsequence is " + longestConsecutiveSubsequenceUsingSet(arr));
    }

    private static Integer longestConsecutiveSubsequenceUsingSet(int[] arr) {
        // here I am using HashSet for counting
        HashSet<Integer> set = new HashSet<>();
        for (int num : arr) {
            set.add(num);
        }
        int longest = 0;
        for (int num : set) {
            // check if the current number is the start of a sequence
            if (!set.contains(num - 1)) {
                int currentNum = num;
                int currentStreak = 1;

                while (set.contains(currentNum + 1)) {
                    currentNum++;
                    currentStreak++;
                }
                longest = Math.max(longest, currentStreak);
            }
        }
        return longest;

    }

    private static String longestConsecutiveSubsequence(int[] arr) {
        // Sort the Array
        Arrays.sort(arr);
        int longest = 1;
        int currentStreak = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i - 1]) {
                continue;
            } else if (arr[i] == arr[i - 1] + 1) {
                // consecutive number
                currentStreak++;
            } else {
                longest = Math.max(longest, currentStreak);
                currentStreak = 1;
                // because we have to start counting from the current number
            }
        }
        // to check for the last streak
        longest = Math.max(longest, currentStreak);
        return "Longest Consecutive Subsequence is " + longest;

    }
}
