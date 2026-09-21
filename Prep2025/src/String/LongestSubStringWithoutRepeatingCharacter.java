package String;

import java.util.HashSet;
import java.util.Set;

public class LongestSubStringWithoutRepeatingCharacter {
    public static void main(String[] args) {
        // input is "abcabcbb" and output will be 3 because the longest substring without repeating characters is "abc"
        String str = "abcabcbb";
        System.out.println("Longest Substring Without Repeating Character is " + longestSubStringWithoutRepeatingCharacter(str));
    }
    private static int longestSubStringWithoutRepeatingCharacter(String str) {
        // generating all substring  as of now
        int max = 0;
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j <= str.length(); j++) {
                String subString = str.substring(i, j);
                boolean ans = checkUniqueSubString(subString);
                if (ans) {
                    max = Math.max(max, subString.length());
                }
            }}
        return max;
    }
    private static boolean checkUniqueSubString(String subString) {
        Set<Character> set = new HashSet<>();
        for (int i = 0; i < subString.length(); i++) {
            char ch = subString.charAt(i);
            if (set.contains(ch)) {
                return false;
            }
            set.add(ch);
        }
        return true;
    }
}
