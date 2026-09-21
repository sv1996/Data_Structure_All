package String;

public class ReverseWordsOfStrings {


    public static void main(String[] args) {
        //
//        Example 1:
//
//        Input: s = "the sky is blue"
//        Output: "blue is sky the"
//        Example 2:
//
//        Input: s = "  hello world  "
//        Output: "world hello"
//        Explanation: Your reversed string should not contain leading or trailing spaces.
        //
        String s = "the sky is blue";
        System.out.println("reverse word of String is " + reverseWords(s));
        
        
    }

    private static String reverseWords(String s) {
        // I need to split the string into words and then reverse the order of the words and then join them back
        String[] words = s.split(" ");
        String result = "";
        for (int i = words.length - 1; i >= 0; i--) {
          if(!words[i].isEmpty()){
              result += words[i] + " ";
          }

        }

        return result.trim();
    }
}
