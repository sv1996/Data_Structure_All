package  Thread;
class MyThread extends Thread {

        public void run ()
        {
            for (int i=0;i<4;i++)
            {
                System.out.println("Main Thread");
                try{
                    Thread.sleep(1000);
                }
                catch (Exception e){
                    System.out.println("exceptiion catch");
                }
            }

        }
    }

public class Thread1 {
    public static void main(String[] args) {
        MyThread th = new MyThread();
        th.start();
        Thread t = Thread.currentThread();
        String tname=t.getName();
        System.out.println("name is "+tname);


    }
}
