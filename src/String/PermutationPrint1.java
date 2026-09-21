package String;

import java.util.Scanner;

public class PermutationPrint1
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String");
        String str  = sc.nextLine();
        char st[] =str.toCharArray();
        printPermutation(st,0);
    }

    private static void printPermutation(char[] ch, int cid) {
        if(cid==ch.length-1)
        {
            printArray(ch);
            return;
        }
        for (int i = cid; i <ch.length ; i++) {
              swap(ch,i,cid);
              printPermutation(ch ,cid+1);
              swap(ch,i,cid);
            }
    }

    private static void printArray(char[] ch) {

        for (int i = 0; i < ch.length; i++) {
            System.out.print(ch[i]);
        }
        System.out.println();
    }

    private static void swap(char[] arr, int i, int j) {
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
