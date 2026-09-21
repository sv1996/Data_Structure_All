package Java8Streams.FunctionalInterface;

import java.util.function.Supplier;

public class main {


    public static void main(String[] args) {
        Supplier<Integer> isEvenNumber  = ()-> 42;
        System.out.println( isEvenNumber.get());
        System.out.println("Hello dear");
    }
}
