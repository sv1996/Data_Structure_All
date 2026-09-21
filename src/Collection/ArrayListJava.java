package  Collection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListJava {
    public static void main(String[] args) {
        ArrayList a = new ArrayList();
        a.add('a');
        a.add("Shivam");
        a.add(null);

        a.add(1);
        a.add(1);
        a.add(2);

        System.out.println(a);
        //get Synchronized version of Array List
        ArrayList al = new ArrayList();
        List l = Collections.synchronizedList(al);


    }
}
