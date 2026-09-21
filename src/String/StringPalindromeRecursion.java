package String;

import java.util.Scanner;

public class StringPalindromeRecursion {

    private static boolean ispalindromeCheckRecursion1(String s) {
        if(s.length() == 0 || s.length()==1)
        {
            return true;
        }

        if(s.charAt(0) == s.charAt(s.length()-1))
        {
            return ispalindromeCheckRecursion1(s.substring(1,s.length()-1));
        }
        return false;
    }
    private static boolean palindromeCheckRecursion2(String str, int startIndex, int endIndex) {
if(startIndex>=endIndex)
{
    return true;
}
return (str.charAt(startIndex) == str.charAt(endIndex)) && palindromeCheckRecursion2( str,startIndex+1,  endIndex-1);
    }

    private static boolean palindromeCheckRecursion3(String str) {
        int startIndex =0;
        int endIndex = str.length()-1;
        while(startIndex<endIndex)
        {
            if(str.charAt(startIndex)!= str.charAt(endIndex))
            {
                return  false;
            }
            startIndex++;
            endIndex--;
        }
        return true;
    }
    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
        System.out.println("Enter String");
        String str = input.nextLine();
        int len =  str.length();
     //   ispalindromeCheckRecursion1(str);
     //   palindromeCheckRecursion2(str, 0 ,str.length()-1);
      //  palindromeCheckRecursion3(str);


    }


}
