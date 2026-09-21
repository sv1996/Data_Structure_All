package Java8Streams.Java8Coding;

import java.util.List;

public class FindFirstElement {

    public static void main(String[] args) {
        // finding first element using streams
        List<Integer> al = List.of(10, 20, 30, 40, 50);
        al.stream().findFirst().ifPresent(System.out::println);
    }
}
