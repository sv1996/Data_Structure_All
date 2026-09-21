package  Collection;

import java.util.ArrayList;
import java.util.Vector;

public class VectorJava {
    public static void main(String[] args) {
        ArrayList al = new ArrayList(10);
            al.add("shivam");
            al.add("Vish");
            al.add("ram");
            al.toString();
        System.out.println(al);

            Vector <String>v = new Vector<String>();
            v.add("Hey");
            v.add("Gimmu");
            v.add("lolu");
            System.out.println(v.capacity());

         v.forEach((n) -> System.out.print(n+" "));


    }


}
