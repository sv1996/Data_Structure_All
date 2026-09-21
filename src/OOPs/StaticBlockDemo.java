package OOPs;
class Demo{
    static int i;
    int j;
    static {

        i=10;
        System.out.println("Static block called");
    }

}
public class StaticBlockDemo {


    public static void main(String[] args) {
        System.out.println(Demo.i);
    }
}
