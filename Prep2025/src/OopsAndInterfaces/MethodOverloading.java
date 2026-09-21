package OopsAndInterfaces;


public class MethodOverloading {


    public void MethodOne() {
        System.out.println("Method with no parameters");
    }

    public void MethodOne(int a) {
        System.out.println("Method with one integer parameter: " + a);
    }


    public void MethodOne(double a) {
        System.out.println("Method with one double parameter: " + a);
    }

    public void MethodOne(int a, int b) {
        System.out.println("Method with two integer parameters: " + a + ", " + b);
    }

    public void MethodOne(String s) {
        System.out.println("Method with one string parameter: " + s);
    }


    public static void main(String[] args) {

        MethodOverloading obj = new MethodOverloading();
        obj.MethodOne();
        obj.MethodOne(10);
        obj.MethodOne(10.5);
        obj.MethodOne(10, 20);
        obj.MethodOne("Hello");

    }
}
