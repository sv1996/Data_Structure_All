package LinkedList;

import static LinkedList.LinkedListImplementation.printLinkedList;

public class ReverseLinkedList {
    public static void main(String[] args) {
        LinkedListNode firstNode = new LinkedListNode(10);
        LinkedListNode secondNode = new LinkedListNode(20);
        LinkedListNode thirdNode = new LinkedListNode(30);
        LinkedListNode fourthNode = new LinkedListNode(40);
        firstNode.next = secondNode;
        secondNode.next = thirdNode;
        thirdNode.next = fourthNode;
        System.out.println("Reversed Linked List is:");
        firstNode = reverseLinkedList(firstNode);
        System.out.println("Printing the linked list:");
        printLinkedList(firstNode);
    }

    private static LinkedListNode reverseLinkedList(LinkedListNode head) {
        // using iterative approach
        LinkedListNode currentNode = head;
        LinkedListNode previousNode = null;
        LinkedListNode nextNode = null;
        // Traverse all the nodes of Linked List
        while (currentNode != null) {
            // store next node
            nextNode = currentNode.next;
            // reverse the current node's pointer
            currentNode.next = previousNode;
            // move pointers one position ahead.
            previousNode = currentNode;
            // move to next node
            currentNode = nextNode;
        }
        // at the end previousNode will be the new head of reversed linked list
        return previousNode;
    }

}
