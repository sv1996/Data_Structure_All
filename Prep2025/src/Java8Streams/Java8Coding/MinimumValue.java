package Java8Streams.Java8Coding;

import java.util.ArrayList;
import java.util.List;

public class MinimumValue {


    public static void main(String[] args) {
        // find Minimum value using java stream
        List<Integer> al = List.of(1, 2, 3, 4, 5);
        Integer minValue = al.stream().min((o1, o2) -> o1.compareTo(o2)).get();
        System.out.println("Minimum value is: " + minValue);

        Integer minVal = al.stream().min(Integer::compareTo).get();
        System.out.println("Minimum value using method reference: " + minVal);
        System.out.println("Using Comparator.naturalOrder()");
        Integer minValue1 = al.stream().min(java.util.Comparator.naturalOrder()).get();
        System.out.println("Minimum value using Comparator.naturalOrder(): " + minValue1);

    }
}
