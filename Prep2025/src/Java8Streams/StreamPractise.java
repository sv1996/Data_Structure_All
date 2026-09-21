package Java8Streams;

import java.util.List;

public class StreamPractise {

    public static void main(String[] args) {

        List<Integer> salaryList = List.of(1000, 2000, 3000, 4000, 5000, 6000);
        // find the salary greater than 3000 and double it and collect it as list
        salaryList.stream().filter(s->s>3000).map(s->s*2).forEach(System.out::println);
    }
}
