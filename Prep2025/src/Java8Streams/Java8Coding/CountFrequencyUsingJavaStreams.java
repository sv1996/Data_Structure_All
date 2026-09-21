package Java8Streams.Java8Coding;

import ArraysPractice.LinearSearch;

import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CountFrequencyUsingJavaStreams {

    public static void main(String[] args) {
        // count frequency of each element using java streams
        List<Character> characters = List.of('a', 'b', 'c', 'd', 'e', 'f', 'a', 'b', 'c', 'a', 'a');
        System.out.println("Frequency of each character is: ");
        Map<Character, Long> frequency = characters.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        for (Map.Entry<Character, Long> entry : frequency.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
        System.out.println("This can be Write Like This Also..!!");
        frequency.forEach((k, v) -> System.out.println(k + " : " + v));
        System.out.println("Another way will be Using Stream..!!");
        String str = "programmingggg";
        str.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .forEach((k, v) -> System.out.println(k + " : " + v));

    }
}
