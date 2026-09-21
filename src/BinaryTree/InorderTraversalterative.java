package BinaryTree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class InorderTraversalterative {
    private static void inorderTraversal(BinaryTreeNode root) {
        if(root==null)
        {
            return;
        }
        inorderTraversal(  root.left);
        System.out.print(root.data+" ");
        inorderTraversal(  root.right);
    }
    private static ArrayList<Integer> inorderTraversalList(BinaryTreeNode root) {
        ArrayList<Integer> ans = new ArrayList<Integer>();

        if(root ==null)
        {
           return ans;
        }
     ArrayList<Integer> L= inorderTraversalList(root.left);
        for (Integer l:L ) {
            ans.add(l);
        }

        ans.add(root.data);
        ArrayList<Integer> R= inorderTraversalList(root.right);
        for (Integer r: R )
        {
            ans.add(r);
        }


        return ans;
    }
    private static void inorderTraversalIterative(BinaryTreeNode root) {
        Stack <BinaryTreeNode> stk = new Stack<BinaryTreeNode>();



    }

    //                  0
//         1                     2
//    3         4         5                6
// InorderOrderTraversal := 3,1,4,0,5,2,6
//
//
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

       List<Integer> ans = inorderTraversalList(root);

       for(Integer a:ans)
       {
           System.out.print(a+" ");
       }
        System.out.println();

        inorderTraversal(root);
        System.out.println();
        inorderTraversalIterative(root);
    }



}
