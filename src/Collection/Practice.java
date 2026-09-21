package Collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Practice {
    public static void main(String[] args) {
        List<Integer> al =  new LinkedList<>();

        for (int i = 0; i < 15; i++) {
            al.add(i);
        }

        al.forEach(n -> System.out.println(n));
        System.out.println("size is "+al.size());
        System.out.println("size is ");

    }
}
