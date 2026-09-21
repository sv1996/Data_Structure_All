package Mathematics;

public class ArmStrongNumber {

    public static void main(String[] args) {
        int number =153;
        if(isArmStrongNumber(number))
        {
            System.out.println(number + " is an Armstrong number");
        }
        else
        {
            System.out.println(number + " is not an Armstrong number");
        }

    }

    private static boolean isArmStrongNumber(int number) {
        // solving using extraction of digits
        int originalNumber = number;
        int sum = 0;
        while (number != 0) {
            int digit = number % 10;
            sum = sum + digit * digit * digit;
            number = number / 10;
        }
        return originalNumber == sum;
    }

}
