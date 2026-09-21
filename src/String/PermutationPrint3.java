package String;

import java.util.Scanner;

public class PermutationPrint3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String");
        String str  = sc.nextLine();
        permutationMethod2(str , 0, str.length()-1);
    }

    private static void permutationMethod2(String str, int l, int r) {
        //   base case
                if(l==r)
             {
              System.out.println(str);
              return;
             }
                for(int i=l;i<=r;i++)
                {
                  str = swap(str,l,i);
                  permutationMethod2(str,l+1, r);
                  str = swap(str,l,i);
                }
    }

    private static String swap(String str, int i, int j) {
        char[] chArray = str.toCharArray();
        char temp = chArray[i];
        chArray[i] =chArray[j];
        chArray[j] =temp;
        return String.valueOf(chArray);
    }
}
