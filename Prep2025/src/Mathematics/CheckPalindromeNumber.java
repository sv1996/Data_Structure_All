package Mathematics;

public class CheckPalindromeNumber {


    public static void main(String[] args) {

        int number = 1213;
        boolean ispalindrom = checkPalindrome(number);
        String ans = ispalindrom ? "is a palindrome" : "is not a palindrome";
        System.out.println(number + " " + ans);
        System.out.println("Using StringBuilder: " + checkPalindromeUsingStringBuilder(number));
        System.out.println("Using characters: " + checkPalindromeUsingCharacters(number));
        System.out.println("Using Recursion: " + checkPalindromeUsingRecursion(number));
    }

    private static String checkPalindromeUsingRecursion(int number) {
        String numString =Integer.toString(number);
        if(isPalindromeRecursiveHelper(numString, 0, numString.length() -1))
        {
            return numString + " is a palindrome";
        }
        else
        {
            return numString + " is not a palindrome";
        }
    }

    private static boolean isPalindromeRecursiveHelper(String numString, int left, int right) {
        if(left >= right)
        {
            return true;
        }
        if(numString.charAt(left) != numString.charAt(right))
        {
            return false;
        }
        return isPalindromeRecursiveHelper(numString, left +1, right -1);
    }


    private static String checkPalindromeUsingCharacters(int number) {

        String numString = Integer.toString(number);
        int left =0;
        int right = numString.length() -1;
        while (left<right)
        {
            if(numString.charAt(left) != numString.charAt(right))
            {
                return numString + " is not a palindrome";
            }
            left++;
            right--;
        }
        return numString + " is a palindrome";
    }



    private static String checkPalindromeUsingStringBuilder(int number) {
        StringBuilder sb = new StringBuilder();
        sb.append(number);
        String originalString = sb.toString();
        String reversedString = sb.reverse().toString();

        if(originalString.equals(reversedString))
        {
            return originalString + " is a palindrome";
        }
        else
        {
            return originalString + " is not a palindrome";
        }

    }

    public static boolean checkPalindrome(int x)
    {

      if(x <0)
      {
          return false;
      }

      int originalNumber = x;
      int reversedNumber =0;
      while (x !=0)
      {
          int lastDigit = x %10;
          reversedNumber = reversedNumber*10+ lastDigit;
          x = x /10;
      }

      return originalNumber == reversedNumber;

    }

}
