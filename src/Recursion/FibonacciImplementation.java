package Recursion;

// fn = fn-1 + fn-2
// 0,1,1,2,3,5,8,13.......
class Fibonacci {

    public int getFibonacci(int n) {
        if (n <= 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else


            return getFibonacci(n - 1) + getFibonacci(n - 2);
    }


}

public class FibonacciImplementation {
    public static void main(String[] args) {
        Fibonacci fibonacci = new Fibonacci();
        int nthFibonacciNumber = fibonacci.getFibonacci(0);
        System.out.println(nthFibonacciNumber);

    }
}
