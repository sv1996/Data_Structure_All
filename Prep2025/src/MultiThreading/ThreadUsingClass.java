package MultiThreading;



class ThreadUsingClassThread extends Thread
{
    @Override
    public void run() {
        System.out.println("This Thread is running: " + Thread.currentThread().getName());
    }

    public void start(int i)
    {
        System.out.println("Thread is about to start: " + Thread.currentThread().getName());
    }
}
public class ThreadUsingClass {


    public static void main(String[] args) {
        System.out.println("Going inside Main Thread: " + Thread.currentThread().getName());
        Thread thread = new ThreadUsingClassThread();
        thread.start();
    }
}
