package Java8AlImplementation;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class MethodReference {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Shivam","Manoj","Priya","Ankita");
        Consumer<String>  con = new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        };

  names.forEach(e-> System.out.print(e+" "));
    }
}
