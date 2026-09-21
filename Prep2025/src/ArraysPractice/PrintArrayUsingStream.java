package ArraysPractice;

import java.util.*;

public class PrintArrayUsingStream {


    public static void main(String[] args) {
      List<Integer> al = new ArrayList<>();
        al.add(10);
        al.add(20);
        al.add(30);
        al.add(40);
        al.add(50);

        // Using Stream API to print elements
        al.forEach(System.out::println);
    }
}
