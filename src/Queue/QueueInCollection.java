package  Queue;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

//Queue is not a class it is Iterface
public class QueueInCollection {
    public static void main(String[] args) {
        Queue <Integer> q = new LinkedList<Integer>();
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);

        System.out.println("Printing the Queue"+ q);
        System.out.println("Size Of Queue" + q.size());
        System.out.println("Peek Of Queue" + q.peek());

        System.out.println("Next method");
        Iterator<Integer> it = q.iterator();
        while(it.hasNext())
        {
            System.out.print(it.next()+" ");
        }

        System.out.println("New Printing");

        q.forEach((n)-> System.out.print(n+" "));

    }
}
