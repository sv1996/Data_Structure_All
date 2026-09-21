package  BinaryTree;
class BinaryTreeNode1 {
    int data;
    BinaryTreeNode left, right;

    BinaryTreeNode1(int d)
    {
       data =d;
       left =null;
       right =null;
    }
}
//                  0
//          1                 2
//    3         4         5        6
// preOrderTraversal := 0 1 3 4 2 5 6
//
//
public class  PreOrderTraversal {
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

preOrderTraversal(root);


    }

    private static void preOrderTraversal(BinaryTreeNode root) {
        if(root==null)
        {
            return ;
        }
        System.out.print(root.data+" ");
        preOrderTraversal( root.left);
        preOrderTraversal( root.right);
    }
}
