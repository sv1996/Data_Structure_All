package  LinkedList;



public class ReverseLinkedList {
    public static void printList(Node head)
    {
        Node temp = head;
        while (temp!= null) {
            System.out.print(temp.data + " ");
            temp = temp.next;


        }
        System.out.println();
    }
    public static Node RevereList (Node head)

    {
        Node newHead = null;

        while (head!=null)
        {
           Node next = head.next;
           head.next = newHead;
           newHead = head;
           head =next;

        }
        return newHead;
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
        Node head = firstNode;
        printList(head);
        printList(head);
        System.out.println();
      Node node1 = RevereList (head);
        printList(node1);

    }




}
