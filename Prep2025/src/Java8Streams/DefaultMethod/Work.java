package Java8Streams.DefaultMethod;

public interface Work {

    int add(int a, int b);

   public default void  work(String task) {
        System.out.println("Working on: " + task);
    }
}
