package BinaryTree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class InsertAnElementInTree {
    public static void printTree( BinaryTreeNode root)
    {
        if(root ==null)
        {
            return ;
        }
        String printed = root.data +";";
        if(root.left!=null)
        {
            printed =printed + "L:"+ root.left.data+",";
        }
        if(root.right!=null)
        {
            printed =printed + "R:" + root.right.data +",";
        }
        System.out.println(printed);
        printTree(root.left);
        printTree(root.right);
    }
    ////////////////////////
    private static  void levelOrderTraversalUsingQueue(BinaryTreeNode root) {
        Queue<BinaryTreeNode> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty())
        {
            BinaryTreeNode temp = q.poll();
            System.out.print(temp.data+" ");
            if(temp.left!=null)
                q.add(temp.left);
            if(temp.right!=null)
                q.add(temp.right);
        }
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        /*
                                     0

                      1                                   2


               3               4                   5             6

 */
        BinaryTreeNode root = new BinaryTreeNode(0);
        BinaryTreeNode node1 = new BinaryTreeNode(1);
        BinaryTreeNode node2 = new BinaryTreeNode(2);
        BinaryTreeNode node3 = new BinaryTreeNode(3);
        BinaryTreeNode node4 = new BinaryTreeNode(4);
        BinaryTreeNode node5 = new BinaryTreeNode(5);
        BinaryTreeNode node6 = new BinaryTreeNode(6);

        root.left =node1;
        root.right =node2;
        node1.left =node3;
        node1.right = node4;
        node2.left= node5;
        node2.right =node6;

        System.out.println("Enter data to be Inserted");
        int data = s.nextInt();
        insertElement(root,data);
        printTree(root);
      // levelOrderTraversalUsingQueue(root);

    }

    private static void insertElement(BinaryTreeNode root, int data) {
        if (root ==null)
        {
        root =  new BinaryTreeNode(data);
        }
         if(root.left ==null)
         {
             root.left =new BinaryTreeNode(data);
         }
         else
         {
             insertElement(root.right,data);
         }
         if(root.right ==null)
         {
             root.right = new BinaryTreeNode(data);
         }
         else
         {
             insertElement(root.left,data);

         }
    }


}
