package Collections.HashMap;

import java.util.HashMap;

public class HashMapPractiseNew {
    public static void main(String[] args) {
        HashMap<String , String > map = new HashMap<>();

        map.put("A", "Apple");
        map.put("A", "Banana");
        map.put(null, "Boot");
        map.put(null, "Microservices");
        map.put(null, "Shivam");
        // its answer is {null=Microservices, A=Banana} because keys are unique in HashMap and last value will be stored for same key and hashmap
        System.out.println(map);
    }
}
