package BinaryTree;

import java.util.LinkedList;
import java.util.Queue;

public class SearchAnElementInBinaryTree {
    public static void main(String[] args) {
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
/*
                                     0

                      1                                   2


               3               4                   5             6

 */
        int element = 6;
      // boolean ans =  searchElementInBinaryTree(root, element);
       boolean BetterAns = searchElementInBinaryTreeWithoutRecursion(root, element);
//       if(ans)
//       {
//           System.out.println("Element Found");
//       }
//       else
//       {
//           System.out.println("Element Not Found");
//
//       }

        if(BetterAns)
        {
            System.out.println("Element Found");
        }
        else
        {
            System.out.println("Element Not Found");

        }



    }

    private static boolean searchElementInBinaryTreeWithoutRecursion(BinaryTreeNode root, int element) {

        if(root ==null)
        {
            return false;
        }
        Queue<BinaryTreeNode> q = new LinkedList<BinaryTreeNode>();
        q.add(root);
        while(!q.isEmpty())
        {
            BinaryTreeNode temp = q.poll();
            if(temp.data ==element)
            {
                return true;
            }
           // System.out.print(temp.data+" ");
            if(temp.left!=null)
                q.add(temp.left);
            if(temp.right!=null)
                q.add(temp.right);
        }
        return false;
    }

    private static boolean searchElementInBinaryTree(BinaryTreeNode root, int element) {
        if(root==null)
        {
            return false;
        }
        if(root.data==element)
        {
            return true;
        }
        return searchElementInBinaryTree( root.left,element) ||  searchElementInBinaryTree( root.right,element);
    }
}
