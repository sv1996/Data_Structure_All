package Java8AlImplementation;

import java.util.List;
import java.util.stream.Collectors;

public class Methods {
    public static void main(String[] args) {
        // filter(Predicate)
        // boolean value function
        //e->e>10



        //map(function)
        /* Work on each Elements

         */
        // filter out Names that starting with A
     List<String> names = List.of("Aman","Abhinav","Ankita","Durgesh");
     List<String> newNames = names.stream().filter(e->e.startsWith("A")).collect(Collectors.toList());
        System.out.println(newNames);

        //Map Of Integer
  // Return the Squares of Every Numbers
        List<Integer> numbers =  List.of(2,3,23,1,6,12);  // Stream nikalna  -> numbers.stream()
     List<Integer>   newNumbers=numbers.stream().map(i->i*i).collect(Collectors.toList());
    newNumbers.forEach(e-> System.out.print(e+" "));
        System.out.println();
//

        names.stream().forEach(e-> System.out.print(e+" "));
        newNames.stream().forEach(System.out::println);


        // sorted
     numbers.stream().sorted().forEach(e-> System.out.println(e));
     System.out.println();



         //getting minimum Numbers
        int minimumNumbers = numbers.stream().min((x,y)->x.compareTo(y)).get();
        System.out.println("ans" + minimumNumbers);


        // Getting Maximum Numbers
        int maximumNumbers = numbers.stream().max((x,y)->x.compareTo(y)).get();
        System.out.println("ans" + maximumNumbers);


    }
}
