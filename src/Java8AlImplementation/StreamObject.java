package Java8AlImplementation;

import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import java.util.Arrays;

public class StreamObject {
    public static void main(String[] args) {
        // Stream API - Collection process
        //collection/ group of Object
        // WAYS TO CREATE STREAMS IN JAVA 8
        // 1- blank Stream
        Stream<Object> emptyStream = Stream.empty();
        //Arryays Of Names
        String names[] = {"Durgesh" ,"Uttam" , "Ankit" , "Divya","Shivam" , "Vishwakarma"};
        Stream<String> stream1 = Stream.of(names);
        stream1.forEach(e-> System.out.println(e));

        // 3
        Stream <Object> streamBuilder=Stream.builder().build();
        //4
        IntStream stream =   Arrays.stream(new int [] {2,4,65,3,564});
        stream.forEach(e-> System.out.println(e));

        //5 . List, Set
        Integer arr[]  = {1,2,3,4,54,5};
        List<Integer> list = Arrays.asList(arr);
        //object pe stream call ho raha hai
        // here list is object
        Stream<Integer> stream2 = list.stream();
        stream2.forEach(e-> System.out.print(e));

    }
}
