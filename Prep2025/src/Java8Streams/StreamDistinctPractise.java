package Java8Streams;

import java.util.Arrays;

public class StreamDistinctPractise {
    public static void main(String[] args) {
        // diostinct() method in Java Streams used to remove duplicates from the stream
        // Example
        System.out.println("Distinct Elements: ");
        int arr[] = {1, 2, 2, 3, 4, 4, 5, 5, 5, 6};
        // output will be 1,2,3,4,5,6
        Arrays.stream(arr).distinct().forEach(System.out::println);

    }
}
