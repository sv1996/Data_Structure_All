package  BinaryTree;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Stack;

public class PreorderTraversalIterative {
    private static void preorderTraversalIterative2(BinaryTreeNode root) {
        Stack<BinaryTreeNode> stk = new Stack<BinaryTreeNode>();
        if(root ==null)
        {
            return;
        }
        stk.push(root);

        while (!stk.isEmpty())
        {
            BinaryTreeNode temp=   stk.peek();
            System.out.print(temp.data+" ");
            stk.pop();
            if(temp.right!=null)
            {
                stk.push(temp.right);
            }
            if(temp.left!=null)
            {
                stk.push(temp.left);
            }
        }
    }

    private static ArrayList<Integer> preorderTraversalIterative(BinaryTreeNode root) {
        ArrayList<Integer> res = new ArrayList<Integer>();
        if(root==null)
        {
            return res;

        }
        Stack<BinaryTreeNode> stk= new Stack<BinaryTreeNode>();
        stk.push(root);
        while(!stk.isEmpty())
           {
            BinaryTreeNode temp = stk.pop();
            res.add(temp.data);
            if(temp.right!=null)
            {
                stk.push(temp.right);
            }
            if(temp.left!=null)
            {
                stk.push(temp.left);
            }
           }
        return res;
    }

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

        ArrayList<Integer> ans   =  preorderTraversalIterative(root);
        for (Integer res:ans)
             {
            System.out.print(res+" ");
             }

        System.out.println();
        preorderTraversalIterative2(root);


    }



}
