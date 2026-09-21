package Java8AlImplementation;


import java.util.Arrays;
import java.util.List;

public class ForEachInJava8 {
    public static void main(String[] args) {

         Integer arr[]  = {1,2,3,4,54,5};
         List<Integer> list = Arrays.asList(arr);
         list.forEach((a)-> System.out.println(a));
    }
}
