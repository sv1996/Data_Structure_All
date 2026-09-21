package Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorPractise {

    public static void main(String[] args) {
        List<Integer> al = new ArrayList<>();
        al.add(10);
        al.add(20);
        al.add(30);
        al.add(40);
        al.add(50);

      Iterator<Integer> iterator = al.iterator();

      while(iterator.hasNext())
      {
        int value =  iterator.next();
        if(value == 30)
        {
            iterator.remove();
        }


      }
        System.out.println(al);






    }
}
