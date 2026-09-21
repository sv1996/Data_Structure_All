package Java8Streams;

import java.util.List;

public class StreamSortedPractise {
    public static void main(String[] args) {
        List<Integer> alList = List.of(5, 3, 8, 1, 2, 7, 4, 6);
        System.out.println("Sorted List in Ascending Order: ");
        alList.stream().sorted().forEach(System.out::println);
        // sorting in descending order
        System.out.println("Sorted List in Descending Order: ");
        System.out.println();
        alList.stream().sorted((v1,v2)->v2.compareTo(v1)).forEach(System.out::print);
    }

}
