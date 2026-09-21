package MultiThreading;

class RunnableDemo implements Runnable
{

    @Override
    public void run() {
        System.out.println("This Runnable Thread is running: " + Thread.currentThread().getName());
    }
}

public class MultiTreadingInJava {

    public static void main(String[] args) {

        System.out.println("Going inside Main Thread: " + Thread.currentThread().getName());
        RunnableDemo r1 = new RunnableDemo();
        Thread thread = new Thread(r1);
        thread.start();
      }
}
