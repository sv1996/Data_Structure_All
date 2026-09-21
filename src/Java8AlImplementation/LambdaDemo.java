package Java8AlImplementation;
interface  A
{
    void show();
}
//class NewClass implements A {
//    public void show ()
//    {
//        System.out.println("Hello");
//    }
//}
public class LambdaDemo {
    public static void main(String[] args) {
        int width=10;
        //without lambda, Drawable implementation using anonymous class
        A obj =()->
        {
            System.out.println("Drawing[Implementation of Interface]->"+ width);
        };
        //Or It Can Be Write Like
//        B b;
//        b = ()  -> System.out.println("Hello Shivam->");
//        b.show();
//        A obj = new A() {
//            public void show() {
//                System.out.println("Drawing[Implementation of Interface]->"+ width);
//            }

        obj.show();
    }
}
