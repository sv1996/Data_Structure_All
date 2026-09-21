package String;

import java.util.Scanner;

public class AllsubstringOfString {

    private static void  subString(String str, int n) {
        for (int i=0;i<n;i++)
        {
            for(int j=i+1;j<=n;j++)
            {
                System.out.println(str.substring(i,j));
            }
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Your String Here");
        String str = input.nextLine();
        //converting to Array
        subString(str, str.length());

    }

}
