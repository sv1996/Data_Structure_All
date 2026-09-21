package Java8AlImplementation;

import java.util.List;
import java.util.Arrays;
import java.util.function.Consumer;
class ConsImpl implements Consumer<Integer>
{

public void accept (Integer i)
{
    System.out.print(i);
}

}

public class ConsumerInterfaceDemoCode {
    public static void main(String[] args) {
        List<Integer> values = Arrays.asList(4,5,6,7,8);
        Consumer<Integer> c  =  i -> System.out.println(i);
          values.forEach(c);
    }
}
