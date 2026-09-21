package InterfaceAndAbstraction;

interface Phone {
    void call();
    default void message()
    {
        System.out.println("Messaged Here");
    }
}
class AndroidPhone implements  Phone {
    public void call(){
        System.out.println("Calling");
    }
}
public class DemoInterface   {

    public static void main(String[] args) {
    Phone p = new AndroidPhone();
    p.call();
    p.message();


    }
}
