package Java8AlImplementation;

import java.util.Arrays;
import java.util.List;
 class MyPrinter
 {
     public void print(String str)
     {
         System.out.println(str);
     }
 }
public class MethodReferenceDemo {
    public static void main(String[] args) {
        List<String> name = Arrays.asList("sh" , "skd", "asw" , "utr" , "12");
        name.forEach(System.out::println);
        String str = "Shivam Vishwakarma";
        MyPrinter mp = new MyPrinter();
        mp.print(str);


    }
}
