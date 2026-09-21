package LinkedList;

public class LinkedListImplementation {
    public static void main(String[] args) {
        LinkedListNode firstNode = new LinkedListNode(10);
        LinkedListNode secondNode = new LinkedListNode(20);
        LinkedListNode thirdNode = new LinkedListNode(30);
        LinkedListNode fourthNode = new LinkedListNode(40);
        firstNode.next = secondNode;secondNode.next = thirdNode;thirdNode.next = fourthNode;
        System.out.println("Printing the linked list:");
        printLinkedList(firstNode);
        System.out.println("Printing middle of linked list:");
        printMiddleOfLinkedList(firstNode);
        System.out.println("Printing middle of linked list: using two pointer approach:");
        printMiddleOfLinkedListUsingTwoPointerApproach(firstNode);
        printLinkedListReverse(firstNode);

    }

    private static void printLinkedListReverse(LinkedListNode head) {
        // using recursion
        if(head== null)
        {
            return;
        }
        printLinkedListReverse(head.next);
        System.out.print(head.data + " -> ");
    }


    private static int printMiddleOfLinkedListUsingTwoPointerApproach(LinkedListNode head) {
        // using fast and slow pointer approach
        LinkedListNode fastPointer = head;
        LinkedListNode slowPointer = head;
        while(fastPointer!= null && fastPointer.next!= null) {
            slowPointer = slowPointer.next;
            fastPointer = fastPointer.next.next;
        }
        System.out.println("Middle Node of LinkedList using two pointer approach is: " + slowPointer.data);
        return slowPointer.data;
    }
    private static void printMiddleOfLinkedList(LinkedListNode firstNode) {
        // method to print middle Of LinkedList
        int n = getLengthOfLinkedList(firstNode);
        int midIndex = n / 2;
        LinkedListNode currentNode = firstNode;
        while (midIndex > 0) {
            currentNode = currentNode.next;
            midIndex--;
        }
        System.out.println("\nMiddle Node of LinkedList is: " + currentNode.data);
    }
    private static int getLengthOfLinkedList(LinkedListNode Node) {
        int length = 0;
        LinkedListNode currentNode = Node;
        while (currentNode != null) {
            length++;
            currentNode = currentNode.next;
        }
        System.out.println("\nLength of LinkedList is: " + length);
        return length;
    }

    static void printLinkedList(LinkedListNode node) {
        while (node != null) {
            System.out.print(node.data + " -> ");
            node = node.next;
        }
    }


}
