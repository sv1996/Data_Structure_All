package BinaryTree;

//import com.Queue.QueueEmptyException;

import java.util.LinkedList;
import java.util.Queue;

class BinaryTreeNode {
    int data;
    BinaryTreeNode left;
    BinaryTreeNode right;
    BinaryTreeNode(int d)
    {
        data= d;
        left =null;
        right =null;
    }
}
/*
        1
    2         3
 4    5     6   7
 */
public class BinaryTreeUse {
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
///////////////print LevelWise Tree
private static void printLevelWise(BinaryTreeNode root)  {
    Queue<BinaryTreeNode>queue = new LinkedList<BinaryTreeNode>();
    queue.add(root);
    while(!queue.isEmpty())
    {
     BinaryTreeNode current = null;
     try
     {
         current = queue.remove();
     }
catch ( Exception e){
         e.printStackTrace();
}


String printed = current.data+":";
if(current.left!=null)
{
    printed = printed + "L:" + current.left.data+" ";
    queue.add(current.left);
}
else
{
    printed =printed+ "L: -1,";
}
if(current.right!=null)
{
    printed = printed + "R:"+ current.right.data;
    queue.add(current.right);
}
else
{
    printed =printed+ "R:-1";
}
        System.out.println(printed);
    }
    }

    public static void main(String[] args) throws Exception
    {
        BinaryTreeNode root =  new BinaryTreeNode(1);
        BinaryTreeNode node1 =  new BinaryTreeNode(2);
        BinaryTreeNode node2 =  new BinaryTreeNode(3);
        BinaryTreeNode node3 =  new BinaryTreeNode(4);
        BinaryTreeNode node4 =  new BinaryTreeNode(5);
        BinaryTreeNode node5=  new BinaryTreeNode(6);
        BinaryTreeNode node6 =  new BinaryTreeNode(7);
        root.left=node1;
        root.right =node2;
        node1.left =node3;
        node1.right =node4;
        node2.left=node5;
        node2.right =node6;
        printTree(root);
        System.out.println("Print Level Wise");
        printLevelWise(root);
    }


}
