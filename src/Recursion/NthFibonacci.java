package Recursion;
import java.util.Scanner;
public class NthFibonacci {
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        System.out.println("Enter Number");
        int num = s.nextInt();
        System.out.println(nthFibonacciNum(num));
    }
    static int nthFibonacciNum(int n )
    {
        if(n==0 || n==1)
        {
            return n;
        }
        return nthFibonacciNum(n-1) +  nthFibonacciNum(n-2);
    }
}
