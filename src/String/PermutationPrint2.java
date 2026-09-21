package String;

import java.util.Scanner;

public class PermutationPrint2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String");
        String str  = sc.nextLine();
        permutationMethod2(str , 0);
    }

    private static void permutationMethod2(String str, int i) {

        if(i==str.length())
        {
            System.out.println(str);
            return;
        }

        for (int j = i; j <str.length(); j++) {
            swap(str.charAt(i), str.charAt(j));
            permutationMethod2(str,i+1);
            swap(str.charAt(i), str.charAt(j));
        }
    }

    private static void swap(char ch1, char ch2) {

      char  temp = ch1;
        ch1 =ch2;
        ch2= temp;
    }
}
