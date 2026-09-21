package Thread;

class MyThread1 extends Thread{
    public void run()
    {

            System.out.println("Child Thread" + Thread.currentThread().getName());


    }





}
public class ThreadPoolDemo {
    public static void main(String[] args) throws InterruptedException {
        MyThread1 t = new MyThread1();
        t.start();
        Thread.sleep(10000);

            System.out.println("Main Thread Name-" + Thread.currentThread().getName());
         //   Thread.sleep(10000);


    }
}
