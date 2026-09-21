package ArraysPractice;

public class BitWiseXorPractise {
    public static void main(String[] args) {


        int result = 2 ^ 2; // Bitwise XOR operation
        // output will be 0 since both bits are same
        // 0^any number will be the number itself and hence
        int result1 = 2^2^2^2^2; // output will be 2 since even number of same bits will cancel out each other
        System.out.println("The result of " + result1);
    }
}
