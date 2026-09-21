package Java8Streams.Java8Coding;

import java.util.List;
import java.util.function.IntPredicate;
import java.util.function.Predicate;
import java.util.stream.IntStream;

public class PrimeUsingStreams {

    public static void main(String[] args) {

        List<Integer> nums = IntStream.rangeClosed(1, 100).boxed().toList();
        // check prime number using java streams
        Predicate<Integer> filter = new Predicate<Integer>() {
            @Override
            public boolean test(Integer num) {
                if (num == 0 || num == 1) {
                    return false;
                }
                for (int i = 2; i <= Math.sqrt(num); i++) {
                    if (num % i == 0) {
                        return false;
                    }
                }

                return true;
            }
        };
        nums.stream().filter(filter).forEach(System.out::println);
    }
}
