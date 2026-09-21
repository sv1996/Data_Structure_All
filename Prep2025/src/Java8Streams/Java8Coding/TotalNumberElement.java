package Java8Streams.Java8Coding;

import java.util.List;

public class TotalNumberElement {
    public static void main(String[] args) {
        // find total number of elements using streams
        List<Integer> al = List.of(1, 2, 3, 4, 5);
        Long count = al.stream().count();
        System.out.println(count);
    }
}
