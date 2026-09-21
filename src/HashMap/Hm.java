package HashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Map;

public class Hm {
    public static void main(String[] args) {
      Map <Integer, String> h = new HashMap<Integer , String>();
        h.put(1,"Shiva");
        h.put(2,"Vish");
        h.put(3,"Garima");
        h.put(4,"Kumari");

        for(Map.Entry  entry : h.entrySet())
        {
            System.out.println("Key:"+ entry.getKey() + "Value:" + entry.getValue());
        }



        System.out.println(h);
        System.out.println(h.containsKey(2));
    }
}
