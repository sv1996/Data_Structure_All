package Java8Streams.Java8Coding;

import java.util.HashSet;
import java.util.List;

public class FindDuplicateUsingStreams {

    public static void main(String[] args) {
        // find duplicate elements in an array using streams
        List<Integer> al = List.of(1, 2, 3, 4, 5, 3, 2, 1, 6, 7, 8, 8);
        System.out.println("Duplicate elements are: ");
        // here making use of HashSet to store unique elements
        HashSet <Integer> set = new HashSet<>();
        // this code will add elements to set and if element is already present
        // it will return false and filter will pass that element to forEach to print
        al.stream().filter(s->! set.add(s)).forEach(System.out::println);
        System.out.println("Find Duplicates of Character..!!");
        String str = "programming";
        HashSet <Character> charSet = new HashSet<>();
        str.chars().filter(a-> !charSet.add((char)a)).forEach(c->System.out.println((char)c));





    }
}
