package Mathematics;

public class CheckPrimeNumber {

    public static void main(String[] args) {
        System.out.println(isPrime(4));// true
        System.out.println(isPrimeOptimized(23));// false
        printPrimeTillN(100);
    }



    private static void printPrimeTillN(int number) {
        for(int i=2;i<=number;i++)
        {
            if(isPrimeOptimized(i))
            {
                System.out.print(i + " ");
            }
        }

    }

    private static boolean isPrimeOptimized(int number) {
        if(number <=1)
        {
            return false;
        }
        for(int i=2;i<=Math.sqrt(number);i++)
        {
            if(number % i ==0)
            {
                return false;
            }
        }
        return true;

    }

    public static boolean isPrime(int number) {
       int count=0;
        for(int i=1;i<=number;i++)
        {
            if(number%i==0)
            {
                count++;
            }
        }
        if(count ==2)
        {
            return true;
        }
        else
        {
            return false;
        }
    }


}
