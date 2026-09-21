package Java8AlImplementation;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMain1 {
    public static void main(String[] args) {
        List<Integer> list1 = List.of(2,4,50,21,43,6,8);
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
          //Without Stream API We need to code even Numbers only
         //Below Are Only Boiler Plate Code
        List<Integer> listEven = new ArrayList<>();
        for(Integer i : list1)
        {
            if(i%2 ==0)
            {
                listEven.add(i);
            }
        }
        System.out.println(list1);
        System.out.println(listEven);
        // With Stream API

        Stream<Integer> stream=list1.stream();
        List<Integer> newlist = stream.filter(i->i%2==0).collect(Collectors.toList());
        System.out.println(newlist);
        //or We Can Write This As
        List<Integer> newList = list1.stream().filter(i->i%2==0).collect(Collectors.toList());
        System.out.println(newList);
        // We Need Numbers Greater than 10

        List<Integer> newList1= list1.stream().filter(i->i>10).collect(Collectors.toList());
        System.out.println(newList1);
    }
}
