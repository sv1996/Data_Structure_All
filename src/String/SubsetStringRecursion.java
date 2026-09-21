package String;
/*
Input :  set = "abc"
Output : "". "a", "b", "c", "ab", "ac", "bc", "abc"

Input : set = "abcd"
Output : "" "a" "ab" "abc" "abcd" "abd" "ac" "acd"
         "ad" "b" "bc" "bcd" "bd" "c" "cd" "d"

*/

import java.util.Scanner;

public class SubsetStringRecursion {
    private static void subsetString(String str, String cur , int i) {
    if(i==str.length())
    {
        System.out.println(cur);
        return ;
    }
        subsetString( str,  cur ,   i+1);
        subsetString( str,  cur+str.charAt(i) ,   i+1);



    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Your String Here");
        String str = input.nextLine();
        String cur = "";
        int i =0;

        subsetString(str,cur ,i);
    }


}
