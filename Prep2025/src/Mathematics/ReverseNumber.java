package Mathematics;

public class ReverseNumber {
    public static void main(String[] args) {
        int n = -123;
        int reverseNumber = reverseNumber(n);
        System.out.println(reverseNumber);
    }

    public static int reverseNumber(int n)
    {
        if(n<0)
        {
            throw new IllegalArgumentException("Input must be a non-negative integer");
        }
        n = Math.abs(n);
        int reverse =0;
        while(n>0)
        {
            int lastDigit = n%10;
            reverse = reverse*10+ lastDigit;
            n = n/10;
        }
        return reverse;
    }

}
