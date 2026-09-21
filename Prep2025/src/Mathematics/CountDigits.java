package Mathematics;

public class CountDigits {
    public static void main(String[] args) {
        int n = 132;
        int ans = countDigits(n);
        System.out.println(ans);
        int ansRecursion = countDigitsUsingRecursion(n);
        System.out.println(ansRecursion);
        int ansString = countDigitsUsingString(n);
        System.out.println(ansString);
    }

    private static int countDigitsUsingString(int n) {
        String number = Integer.toString(n);
        return number.length();
    }

    private static int countDigitsUsingRecursion(int n) {
        if(n/10==0)
        {
            return 1;
        }

        n = Math.abs(n);
        return 1 + countDigits(n/10);
    }

    private static int countDigits(int n) {
        if(n ==0)
        {
            return  1;
        }
        int count =0;
        n = Math.abs(n);
        while(n>0)
        {
            int lastDigit = n%10;
            n = n/10;
            count++;
        }

        return count;
    }


}
