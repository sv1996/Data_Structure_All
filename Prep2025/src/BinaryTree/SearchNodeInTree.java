package BinaryTree;

import static BinaryTree.BinaryTreeMainImpl.heightOfTree;

public class SearchNodeInTree {
    // Binary tree
    //          0
    //        /  \
    //       1    2
    //      / \   / \
    //     3   4 5   6
    //    /   / \
    //   7   8   9

    public static void main(String[] args) {
        TreeNode root = new TreeNode(0);
        root.left = new TreeNode(1);
        root.right = new TreeNode(2);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(4);
        root.right.left = new TreeNode(5);
        root.right.right = new TreeNode(6);
        root.left.left.left = new TreeNode(7);
        root.left.right.left = new TreeNode(8);
        root.left.right.right = new TreeNode(9);
        //   printTreeLevelWise(root);
        if (searchNode(root, 5)) {
            System.out.println("Element found in the tree");
        } else {
            System.out.println("Element not found in the tree");
        }
        int ans = countNodesInBinaryTree(root);
        System.out.println(ans);

        int diameter = diameterOfBinaryTree(root);
        // for the above tree the diameter is 5 (7->3->1->4->8 or 7->3->1->4->9)
        System.out.println("Diameter of the binary tree: " + diameter);
    }

    private static int diameterOfBinaryTree(TreeNode root) {
        // using height of the tree to calculate diameter
        if(root == null)
        {
            return 0;
        }
        // get height of left and right subtree
        int leftHeight = heightOfTree(root.left);
        int rightHeight = heightOfTree(root.right);
        // get diameter of left and right subtree
        int leftDiameter = diameterOfBinaryTree(root.left);
        int rightDiameter = diameterOfBinaryTree(root.right);
        // return the maximum of the three
        return Math.max(leftHeight + rightHeight, Math.max(leftDiameter, rightDiameter));
    }

    private static int countNodesInBinaryTree(TreeNode root) {
        if(root == null)
        {
            return 0;
        }
        int leftCount = countNodesInBinaryTree(root.left);
        int rightCount = countNodesInBinaryTree(root.right);
        return 1 + leftCount + rightCount;
    }

    private static boolean searchNode(TreeNode root, int element) {
        if (root == null) {
            return false;
        }

        if (root.data == element) {

            return true;
        }
        // search in left subtree
        boolean leftSearch = searchNode(root.left, element);
        if (leftSearch) {
            return true;
        }
        // search in right subtree
        return searchNode(root.right, element);
    }


}
