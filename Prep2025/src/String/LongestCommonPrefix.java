package String;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] arr = {"flower", "flow", "flight"};
        System.out.println("Longest Common Prefix is " + longestCommonPrefix(arr));
    }

    private static String longestCommonPrefix(String[] arr) {
        String prefix = arr[0];
        for (int i = 1; i < arr.length; i++)
        {
            prefix = getCommonPrefix(prefix, arr[i]);
        }
        return prefix;
    }
    private static String getCommonPrefix(String prefix, String newString) {
        // we will compare the prefix with the new string and return the common prefix
        int minLength = Math.min(prefix.length(), newString.length());
        StringBuilder commonPrefix = new StringBuilder();
        for (int i = 0; i < minLength; i++)
        {
            if (prefix.charAt(i) == newString.charAt(i))
            {
                commonPrefix.append(prefix.charAt(i));
            }
            else
            {
                break;
            }
        }
        return commonPrefix.toString();
    }
}