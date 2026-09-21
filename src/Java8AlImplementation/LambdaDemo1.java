package Java8AlImplementation;
interface B
{
    void show();
}

public class LambdaDemo1 {
    public static void main(String[] args) {
        B b;
        b = ()  -> System.out.println("Hello Shivam->");
        b.show();
    }
}
