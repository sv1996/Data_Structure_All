package StreamSPractise;

import java.util.List;

public class PrintStreams {


    public static void main(String[] args) {
        List<Integer> list = List.of(1,2,3,4,5,6,7,8,9);
        list.add(10);
        list.stream().forEach(System.out::println);
    }
}
