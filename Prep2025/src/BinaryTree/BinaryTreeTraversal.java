package BinaryTree;

import static BinaryTree.BinaryTreeMainImpl.printTreeLevelWise;

public class BinaryTreeTraversal {
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
        printTreeLevelWise(root);
        System.out.println("InOrder Traversal Of Tree");
        // Inorder of This Tree Will be 7 3 1 8 4 9 0 5 2 6
        inOrderTraversal(root);
        System.out.println();
        System.out.println("PreOrder Traversal Of Tree");
        // Preorder of This Tree Will be 0 1 3 7 4 8 9 2 5 6
        preOrderTraversal(root);
        System.out.println();
        System.out.println("PostOrder Traversal Of Tree");
        // Postorder of This Tree Will be 7 3 8 9 4 1 5 6 2 0
        postOrderTraversal(root);
    }

    private static void postOrderTraversal(TreeNode root) {
        if (root == null) {
            return;
        }
        // first traverse left subtree
        postOrderTraversal(root.left);
        // then traverse right subtree
        postOrderTraversal(root.right);
        // then print the root node
        System.out.print(root.data + " ");
    }

    private static void preOrderTraversal(TreeNode root) {
        if (root == null) {
            return;
        }
        // first print the root node
        System.out.print(root.data + " ");
        // then traverse left subtree
        preOrderTraversal(root.left);
        // then traverse right subtree
        preOrderTraversal(root.right);
    }

    public static void inOrderTraversal(TreeNode root) {
        if (root == null) {
            return;
        }
        // first traverse left subtree
        inOrderTraversal(root.left);
        // then print the root node
        System.out.print(root.data + " ");
        // then traverse right subtree
        inOrderTraversal(root.right);
    }

}
