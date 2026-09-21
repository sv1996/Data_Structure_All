package Java8Streams;

import java.util.List;

public class Java8StreamPeak {

    public static void main(String[] args) {

        System.out.println("Java 8 Stream Peak() method  Example");
        List<Integer> alList = List.of(5, 3, 8, 1, 2, 7, 4, 6);
        // peek() method in Java Streams is used to perform intermediate operations on the elements of the stream.
        // it is mainly used for debugging purposes to see the elements as they flow through the stream pipeline.
        // Example
        System.out.println("Elements in the List: ");
        alList.stream()
                .filter(a->a>2)
                .peek(s->System.out.println("Filtered value: " + s))
                .map(s->s*2)
                .peek(s->System.out.println("Mapped value: " + s))
                .forEach(System.out::println);

     }
}
