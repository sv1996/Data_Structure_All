package Java8Streams.Java8Coding;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.IntStream;

public class EvenNumbersUsingStream {

    public static void main(String[] args) {

        // finding even numbers between 1 to 20 using java streams
        System.out.println("Even numbers between 1 to 20 are: ");
        List<Integer> al = List.of(1, 2, 3, 4, 5, 6, 67, 0, 87, 66, 54);
        al.stream().filter(a -> a % 2 == 0).forEach(System.out::print);
        System.out.println();
        System.out.println("Using predicate function");
        Predicate<Integer> filter = new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                return integer % 2 == 0;
            }
        };
        al.stream().filter(filter).forEach(System.out::print);
        System.out.println("Finding even number using 1 to 100");
        IntStream.rangeClosed(1, 100).filter(num -> num % 2 == 0).forEach(System.out::println);
        // sum of numbers using streams
        System.out.println("Sum of numbers from 1 to 100");
        int sum = IntStream.rangeClosed(1, 100).sum();
        System.out.println("Sum of numbers from 1 to 100 is: " + sum);
    }

}
