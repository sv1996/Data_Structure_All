package StreamSPractise;

import java.util.Arrays;
import java.util.List;

public class EvenNumber {

    public static void main(String[] args) {

int [] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        List <Integer>  list = Arrays.stream(numbers).boxed().toList();
        list.stream().filter(n-> n%2==0).forEach(System.out::println);


    }
}
