package Java8Streams;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class FlatMapPractise {

    public static void main(String[] args) {
       // Practice of flatMap in Java Streams
        List<List<String>> lists = List.of(List.of("Shiva", "Gonda"), List.of("Aman", "Ankita"), List.of("Abhinav", "Durgesh"));


        // Flatten the List of Lists into a single List of Integers
        lists.stream().flatMap(Collection::stream).forEach(System.out::print);
        // flatten and change to upper case
        System.out.println("Upper Case Names: ");
        lists.stream().flatMap(sentence-> sentence.stream().map(String::toUpperCase)).forEach(System.out::println);
    }
}
