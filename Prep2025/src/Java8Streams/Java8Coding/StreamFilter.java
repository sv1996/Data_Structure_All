package Java8Streams.Java8Coding;

import java.util.List;

public class StreamFilter {

    public static void main(String[] args) {
        //  Q2 Given a list of integers, find out all the numbers starting with A using Stream functions?
        List<String> names = List.of("Apple", "Ant", "Banana", "Mango", "Avocado", "Orange");
        names = names.stream().filter(name->name.startsWith("A")).toList();
        names.forEach(System.out::println);

        }
}
