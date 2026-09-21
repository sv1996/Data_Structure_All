package Java8Streams.DefaultMethod;

public class Main {

    public static void main(String[] args) {
        WorkImplementation workImpl = new WorkImplementation();
        int sum = workImpl.add(5, 10);
        System.out.println("Sum: " + sum);
        workImpl.work("Java 8 Default Methods");
    }
}
