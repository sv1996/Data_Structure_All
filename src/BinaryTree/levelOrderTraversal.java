package BinaryTree;

import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class levelOrderTraversal {

    private static ArrayList <Integer> levelOrderTraversalUsingArraylist(BinaryTreeNode root) {
        ArrayList <Integer> res = new ArrayList<>();
        if(root==null)
        {
            return res;
        }
        Queue <BinaryTreeNode> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty())
        {
            BinaryTreeNode temp = q.poll();
            res.add(temp.data);
            if(temp.left!=null)
                q.add(temp.left);
            if(temp.right!=null)
                q.add(temp.right);
        }
        return res;
    }
    private static  void levelOrderTraversalUsingQueue(BinaryTreeNode root) {
        Queue <BinaryTreeNode> q = new LinkedList<>();
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
     levelOrderTraversalUsingRecursion(root);
     // System.out.println();
    //    levelOrderTraversalUsingQueue(root);
      System.out.println(hightOfTree(root));
     //   levelOrderTraversalUsingArraylist(root);


      }

    private static void levelOrderTraversalUsingRecursion(BinaryTreeNode root) {


        for(int level=0;level<=hightOfTree(root);level++)
        {
            printLevel(root ,level);
        }
    }

    private static void printLevel(BinaryTreeNode root, int level) {
        if(root ==null)
        {
            return;
        }
        if(level==0)
        {
            System.out.print(root.data+" ");
        }
        if(level>0)
        {
            printLevel( root.left,level-1);
            printLevel( root.right,level-1);
        }
    }

    private static int hightOfTree(BinaryTreeNode root) {
        if(root==null)
        {
            return -1; //-1 for edges and 0 for nodes
        }
        int lh = hightOfTree(root.left);
        int rh = hightOfTree(root.right);

        return 1+ Math.max(lh,rh);
    }

}
