package ThreadPractise;


class MyRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("Implementing through runnable");
        System.out.println(Thread.currentThread().getName());
    }
}



public class ThreadDemoRunnable {


    public static void main(String[] args) {

        MyRunnable myRunnable  = new MyRunnable();
        Thread myThread = new Thread(myRunnable);
        myThread.start();


    }
}
