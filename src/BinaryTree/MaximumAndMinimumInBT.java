package BinaryTree;




public class MaximumAndMinimumInBT {
public static int maximumInBT(BinaryTreeNode root)
{

    if(root==null)
    {
        return Integer.MIN_VALUE;
    }
    int ans = root.data;

    int lmax =  maximumInBT(root.left);
    int rmax = maximumInBT(root.right);
    if(lmax>ans)
    {
      ans = lmax;
    }
     if(rmax>ans)
     {
         ans= rmax;
     }
     return ans;
}

public static int minimumInBT(BinaryTreeNode root)
{
  if(root ==null)
  {
      return Integer.MAX_VALUE;
  }
  int ans = root.data;
  int lmin = minimumInBT(root.left);
  int rmin =minimumInBT(root.right);

  if(lmin<ans)
  {
      ans= lmin;
  }
  if(rmin<ans)
  {
      ans=rmin;
  }
return ans;

}







/*
    int max = Integer.MIN_VALUE;
    if(root!=null)
    {
        int lmax =  maximumInBT(root.left);
        int rmax = maximumInBT(root.right);

        if(lmax > rmax)
        {
            max = lmax;
        }
        else
        {
            max = rmax;
        }
        if(root.data>max)
        {
            max = root.data;
        }
    }
    return max;
    */


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
        int min = minimumInBT(root);
        System.out.println("Minimum Value is " + min);
        int max = maximumInBT(root);
        System.out.println("Maximum element is "+ max);




    }
}
