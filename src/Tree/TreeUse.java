package  Tree;

import com.sun.source.tree.Tree;

import java.util.ArrayList;

class TreeNode {
    int data;
  ArrayList<TreeNode>  children ;


    TreeNode(int d)
    {
       data=d;
     children =  new ArrayList<>();


    }
}
public class TreeUse {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        TreeNode node1 = new TreeNode(2);
        TreeNode node2 = new TreeNode(3);
        TreeNode node3 = new TreeNode(4);
        TreeNode node4 = new TreeNode(4);

        root.children.add(node1);
        root.children.add(node2);
        root.children.add(node3);
        root.children.add(node4);

    for (int i=0;i<root.children.size();i++)
    {
        System.out.println(root.children.get(i).data);
    }


    }
}
