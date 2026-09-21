package  Class;
class A {
    void msg()
    {
        System.out.println("Hello Java");
    }
}
public class B extends A{
   protected void msg()
    {
        System.out.println("Hello JAVA ");
    }
    public static void main(String[] args) {
        B b = new B();
        b.msg();
    }
}
