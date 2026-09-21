package MultiThreading;

class EvenOddThreads {
    private int num = 1;
    private final int limit = 10;
    // Logic for printing Odd numbers
    public synchronized void printOdd() {
        while (num <= limit) {
            if (num % 2 != 0) {
                System.out.println("Odd: " + num);
                num++;
                notify();
            } else {
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    // logic for printing Even Number
    public synchronized void printEven() {
        while (num <= limit) {
            if (num % 2 == 0) {
                System.out.println("Even: " + num);
                num++;
                notify();
            } else {
                try {
                    wait();
                } catch (Exception e) {
                }
            }
        }
    }

}

public class PrintEvenOddUsingMultithreading {
    public static void main(String[] args) {
        EvenOddThreads evenOddThreads = new EvenOddThreads();
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                evenOddThreads.printOdd();
            }
        });
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                evenOddThreads.printEven();
            }
        });
        t1.start();
        t2.start();
    }
}
