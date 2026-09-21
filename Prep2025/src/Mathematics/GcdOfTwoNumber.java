package Mathematics;

public class GcdOfTwoNumber {
    public static void main(String[] args) {
        int a = 4;
        int b = 2;
        System.out.println("GCD of " + a + " and " + b + " is: " + gcd(a, b));

    }

    private static int  gcd(int a, int b) {
        // initially set gcd to 1
        int gcd = 1;
        for (int i = 1; i <= a && i <= b; i++)
        {
            // check if i is a factor of both of number
            if( a%i==0 && b%i==0)
            {
                gcd = i;
            }
        }
        return gcd;
    }
}
