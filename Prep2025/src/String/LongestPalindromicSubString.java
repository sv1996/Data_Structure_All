package String;

public class LongestPalindromicSubString {

    public static void main(String[] args) {
        String str = "babad";
        // output will be "aba" or "bab" because they are the longest palindromic substring
        System.out.println("Longest Palindromic Substring is " + longestPalindromicSubString(str));
    }

    private static String longestPalindromicSubString(String str) {
        // solution will be to generate all the substring and check if they are palindrome or not and keep track of the longest palindrome
        // I will be using first one Approach
        //
        String longest = "";
        for (int i = 0; i <= str.length() - 1; i++) {
            for (int j = i + 1; j <= str.length(); j++) {
                String subString = str.substring(i, j);
                if (isPalindrome(subString)) {
                    if (subString.length() > longest.length()) {
                        longest = subString;
                    }
                }
            }
        }
        return longest;}
    private static boolean isPalindrome(String subString) {
        int left = 0;
        int right = subString.length() - 1;
        while (left < right) {
            if (subString.charAt(left) != subString.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
