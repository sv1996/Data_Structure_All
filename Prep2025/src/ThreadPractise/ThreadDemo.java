package ThreadPractise;


class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println("My Thread is Running");
    }
}
public class ThreadDemo {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();
        System.out.println("Main Method is running ");
    }
}
