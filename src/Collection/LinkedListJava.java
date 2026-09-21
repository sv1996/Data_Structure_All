package   Collection;

import java.util.Collection;
import java.util.LinkedList;

public class LinkedListJava {
    public static void main(String[] args) {
        LinkedList<Object> l = new LinkedList<Object>();
        l.add('a');
        l.add("hey");
        l.add(null);
        l.add(1);
        l.add(1);
        System.out.println(l);
        l.addFirst("Hi");
        System.out.println(l);
        l.addAll(l.size(),l);
        System.out.println(l);
    }
}
