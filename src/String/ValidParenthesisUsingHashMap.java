package String;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ValidParenthesisUsingHashMap {
    public static void main(String[] args) {
//        Scanner s = new Scanner(System.in);
//        System.out.println("Enter the string");
//        String str=s.next();
//        boolean ans = isValid( str);
        Map<Character,Character> map=new HashMap<>();
        map.put(')','(');
        map.put(']','[');
        map.put('}','{');
      //  System.out.println(map);
          for ( Map.Entry m:map.entrySet()){
              System.out.println(m.getKey() +" " + m.getValue());
          }
    }


}
