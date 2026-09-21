package Java8AlImplementation;

import java.util.HashMap;
import java.util.Map;

public class MapImplementation {
    public static void main(String[] args)
    {
        HashMap<Integer , String> map = new HashMap<Integer , String>();
        map.put(1,"Shivam");
        map.put(2,"Rohan");
        map.put(3,"Chaddha");
        map.put(4,"baba");
        System.out.println(map);
        map.forEach((k,v)-> {
            System.out.print(k+"=");
            System.out.print(v);
            System.out.println();
        });
        ///
        System.out.println("Traversing in Entry Style");
        for(Map.Entry m : map.entrySet())
        {
            System.out.println(m.getValue() +" "+ m.getKey());
        }
    }
}
