package Mathematics;

import java.util.List;

public class PrintAllDivisors {
    public static void main(String[] args) {
        int number = 36;
        printAllDivisors(number);
        System.out.println("Optimized way");
        printAllDivisorsOptimized(number);
        System.out.println("Optimized way storing in list");
        printAllDivisorsOptimizedAndStoreInList(number);
        System.out.println("Time complexity of optimized approach is O(sqrt(n)) whereas brute force is O(n)");
    }

    private static void printAllDivisorsOptimizedAndStoreInList(int number) {
        List<Integer> divisors = new java.util.ArrayList<>();

        for (int i=1 ; i<= Math.sqrt(number); i++)
        {
            if(number %i ==0)
            {
                divisors.add(i);
                if(i != number / i)
                {
                    divisors.add(number / i);
                }
            }
        }

        divisors.stream().sorted().forEach(System.out::print);
    }

    private static void printAllDivisorsOptimized(int number) {

        for(int i=1;i<=Math.sqrt(number);i++)
        {
            if(number % i ==0)
            {
                System.out.print(i + " ");
                if(i != number / i)
                {
                    System.out.print(number / i + " ");
                }
            }
        }

    }

    private static void printAllDivisors(int number) {

        for(int i=1; i<= number; i++)
        {
            if(number % i == 0)
            {
                System.out.print(i);
            }
        }
    }
}
