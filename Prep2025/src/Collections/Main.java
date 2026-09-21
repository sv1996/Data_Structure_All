package Collections;

import java.util.Comparator;
import java.util.List;

public class Main {


    public static void main(String[] args) {
        List<Integer> al = List.of(1, 2, 3, 4, 5, 6);
        // find highest element in the list
        System.out.println("Highest Element in the List: ");
        int ans = al.stream().sorted(Comparator.reverseOrder()).findFirst().get();
        System.out.println(ans);
    }
}
