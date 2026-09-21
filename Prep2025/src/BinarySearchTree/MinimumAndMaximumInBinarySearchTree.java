package BinarySearchTree;

import static BinarySearchTree.BinarySearchTreeMain.printLevelWiseTree;
public class MinimumAndMaximumInBinarySearchTree {
    public static void main(String[] args) {
        // Creating BST
        //    6
        //   / \
        //  2   8
        //     / \
        //    7   9
        BinarySearchTreeNode root = new BinarySearchTreeNode(6);
        root.left = new BinarySearchTreeNode(2);
        root.right = new BinarySearchTreeNode(8);
        root.right.left = new BinarySearchTreeNode(7);
        root.right.right = new BinarySearchTreeNode(9);
        // print the tree level wise will be 6 2 8 7 9
        printLevelWiseTree(root);
        System.out.println();
        System.out.println("Minimum Value by Iterative In Binary Search Tree is " + findMinimumUsingIterative(root));
        System.out.println("Maximum Value by Iterative In Binary Search Tree is " + findMaximumValueByIterative(root));

        System.out.println();
        System.out.println("Minimum Value by Recursive In Binary Search Tree is " + findMinimumUsingRecursive(root));
        System.out.println("Maximum Value by Recursive In Binary Search Tree is " + findMaximumValueByRecursive(root));

    }

    private static int findMaximumValueByIterative(BinarySearchTreeNode root) {
        if (root == null) {
            throw new IllegalArgumentException("Tree is empty");
        }
        BinarySearchTreeNode current = root;
        while (current.right != null) {
            current = current.right;
        }
        return current.data;
    }

    private static int findMaximumValueByRecursive(BinarySearchTreeNode root) {
        if (root == null) {
            throw new IllegalArgumentException("Tree is empty");
        }
        if (root.right == null) {
            return root.data;
        }
        return findMaximumValueByIterative(root.right);

    }

    private static int findMinimumUsingIterative(BinarySearchTreeNode root) {
        // using iterative approach
        if (root == null) {
            throw new IllegalArgumentException("Tree is empty");
        }
        BinarySearchTreeNode current = root;
        while (current.left != null) {
            current = current.left;
        }
        return current.data;
    }

    private static int findMinimumUsingRecursive(BinarySearchTreeNode root) {
        if (root == null) {
            throw new IllegalArgumentException("Tree is empty");
        }
        if (root.left == null) {
            return root.data;
        }
        return findMinimumUsingRecursive(root.left);
    }

}
