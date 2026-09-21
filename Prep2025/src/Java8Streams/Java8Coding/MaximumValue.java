package Java8Streams.Java8Coding;

import java.util.Comparator;
import java.util.List;

public class MaximumValue {

    public static void main(String[] args) {
        // getting maximum value from List of integers using streams
        List<Integer> numbers = List.of(10, 45, 78, 23, 56, 89, 12, 5, 99, 34);
        Integer ans = numbers.stream().max(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        }).get();

        System.out.println("Maximum number of value " + ans);
        System.out.println("Using Lambda Expression");
        Integer maxValue = numbers.stream().max((o1, o2) -> o1.compareTo(o2)).get();
        System.out.println("Maximum number using lambda expression: " + maxValue);
        System.out.println("Using Method Reference");
        Integer maxVal = numbers.stream().max(Comparator.naturalOrder()).get();
        System.out.println("Maximum number using method reference: " + maxVal);
        Integer maxValue1  = numbers.stream().max(Comparator.naturalOrder()).get();
        System.out.println("Maximum number using method reference: " + maxValue1);

    }

}
