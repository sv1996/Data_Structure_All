package Java8Streams;

import java.util.List;

public class StreamMapToIntPractise {


    public static void main(String[] args) {
        // mapToInt() method in Java Streams is used to convert a stream of objects to an IntStream
        // Example
        System.out.println("Map to Int Example: ");

        List<String> alList = List.of("1", "2", "3", "4", "5");
        alList.stream().mapToInt(Integer::parseInt).forEach(System.out::println);



    }
}
