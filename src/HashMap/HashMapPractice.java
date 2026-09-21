package HashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapPractice {
    public static void main(String[] args) {
        Map<Integer , String> hm  = new HashMap<Integer , String >();
  // Duplicate Keys
//        hm.put(1,"Shivam");
//        hm.put(1, "Vis");
//        hm.put(3, "Kumar");
        // Duplicate Values
        hm.put(4, "Shivam123");
          hm.put(1,"Shivam");
        hm.put(3, "Kumar");
          hm.put(2, "Vis");

          hm.put(4, "Shivam123");


  Set<Map.Entry<Integer , String >> s = hm.entrySet();
      for (Map.Entry<Integer , String> it: s)
      {
          System.out.println(it.getKey() +" " + it.getValue());
      }



    }
}
