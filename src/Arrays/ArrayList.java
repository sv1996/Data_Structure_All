package Arrays;

import java.io.*;
import java.util.*;
//import java.util.ArrayList;
class Node
{
	int data ;
	Node next;
	
	 Node (int data)
	 {
		 this.data = data;
		 next = null;
	 }
}

public class ArrayList {

	public static void main(String[] args) 
	{
		 
		  Node node1 = new Node(1);
		  Node node2 = new Node(2);
		  Node node3 = new Node(3);
		  Node node4 = new Node(4);
		  Node node5 = new Node(5);
		  node1.next = node2;
		  node2.next =  node3;
		  node3.next =  node4;
		  node4.next =  node5;
		  node5.next = null;
		  Node head = node1;
		  
	int s =	  sizeLinkedList(head);
	System.out.println(s);
	printMiddle(head);
		 
	}


   private static void printMiddle(Node head) {
		 Node sp= head;
		 Node fp = head.next;
		 
		 
		 while (fp!= null && fp.next !=null)
		 {
			 fp = fp.next.next;
			 sp =sp.next;
		 }
		 
		 
		 System.out.println("Slow Pointer data is " + sp.data);
		
	}


public static int sizeLinkedList(Node head) {
     int size =0;
	 while (head != null)
	 {
		 System.out.print(head.data +" ");
		 head = head.next ;
		 size++;
	 }
	 return size;
}
   
   
   
   
   
}

 
