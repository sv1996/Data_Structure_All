package StreamSPractise;

import java.util.List;
import java.util.stream.Collectors;

public class ConvertListOfStringToUpperCase {

    public static void main(String[] args) {


        List<String> list = List.of("java", "python", "c++", "javascript");
        list.stream().map(String::toUpperCase).toList().forEach(System.out::println);

    }
}
