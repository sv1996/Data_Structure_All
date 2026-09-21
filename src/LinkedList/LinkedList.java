package  LinkedList;

class Node
        {
       int data ;
       Node next;

       Node (int d)
       {
          data = d;
          next = null;
       }

        }
public class LinkedList {
   public static void printList(Node head)
   {
       Node temp = head;
       while (temp!= null) {
           System.out.print(temp.data + " ");
           temp = temp.next;


       }
       System.out.println();
   }

    public static void main(String[] args) {


        Node firstNode = new Node (1);
        Node secondNode = new Node (2);
        Node thirdNode = new Node (3);
        Node fourthNode = new Node (4);
        Node fifthNode = new Node (5);

        firstNode.next = secondNode;
        secondNode.next = thirdNode;
        thirdNode.next = fourthNode;
        fourthNode.next =fifthNode;
        printList(firstNode);
        System.out.println();
        System.out.println(thirdNode.hashCode());

   }
}
