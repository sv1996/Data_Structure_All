package Java8Streams;

import java.util.List;

public class StreamLimitAndSkipPractise {

    public static void main(String[] args) {
        // limit() method in Java Streams is used to limit the number of elements in the stream
        // Example
        List<Integer> alList = List.of(5, 3, 8, 1, 2, 7, 4, 6);
        System.out.println("First 5 Elements in the List: ");
        alList.stream().limit(3).forEach(System.out::print);
        System.out.println("nElements after Skipping first 3 Elements in the List: ");
        alList.stream().skip(3).forEach(System.out::print);
    }
}



