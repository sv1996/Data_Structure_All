package BST;
class BstNode{
    public int data;
    BstNode left,right;

    BstNode(int d)
    {
        data =d;
        left =null;
        right =null;
    }
}
//
  //                    root 4
  //
  //              n1  3                     n2 6

       //     n3 1       n4 5       n5 5              n6  7


///
public class BinarySearchTreeUse {
    private static Boolean searchNode(BstNode root, int i) {
        // base;
        if(root==null)
        {
            return false;
        }

        if(i<root.data)
        {
            return  searchNode(root.left, i);
        }
        else if(i>root.data)
        {
            return searchNode(root.right,i);
        }

        return true;
    }
    public static void main(String[] args)
    {
        BstNode root = new BstNode(4);
        BstNode node1 = new BstNode(3);
        BstNode node2 = new BstNode(6);
        BstNode node3 = new BstNode(1);
        BstNode node4 = new BstNode(5);
        BstNode node5 = new BstNode(5);
        BstNode node6 = new BstNode(7);
        root.left =node1;
        root.right =node2;
        node1.left =node3;
        node1.right=node4;
        node2.left =node5;
        node2.right =node6;

boolean ans =   searchNode(root, 1);
    if(ans)
    {
        System.out.println("node is present");
    }
    else
    {
        System.out.println("node is not present ");
    }



    }



}
