package BinarySearchTree;

class BinarySearchTreeNode {
    int data;
    BinarySearchTreeNode left;
    BinarySearchTreeNode right;

    BinarySearchTreeNode(int d) {
        data = d;
        left = null;
        right = null;
    }
}

public class BinarySearchTreeMain {
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
        System.out.println("Method for Searching key in Binary Search Tree");
        // search for key in BST
        int key = 10;
        boolean found = searchInBinarySearchTree(root, key);
        if (found) {
            System.out.println("Key " + key + " found in the Binary Search Tree.");
        } else {
            System.out.println("Key " + key + " not found in the Binary Search Tree.");
        }
    }

    private static boolean searchInBinarySearchTree(BinarySearchTreeNode root, int key) {
        // Base case: root is null or key is present at root
        if (root == null) {
            return false;
        }
        // If key is present at root, return true
        if (root.data == key) {
            return true;
        }
        if (key < root.data) {
            // If key is smaller than root's key, search in left subtree
            return searchInBinarySearchTree(root.left, key);
        } else {
            // If key is greater than root's key, search in right subtree
            return searchInBinarySearchTree(root.right, key);
        }
    }

    private static int heightOfBinarySearchTree(BinarySearchTreeNode root) {
        if (root == null) {
            return 0;
        }
        int leftHeight = heightOfBinarySearchTree(root.left);
        int rightHeight = heightOfBinarySearchTree(root.right);
        return Math.max(leftHeight, rightHeight) + 1;
    }
    static void printLevelWiseTree(BinarySearchTreeNode root) {
        int h = heightOfBinarySearchTree(root);
        // we can do traversal by level wise using recursion or using queue
        // using recursion
        for (int i = 1; i <= h; i++) {
            printGivenLevelOfBinarySearchTree(root, i);
            //    System.out.println();
        }
    }

    private static void printGivenLevelOfBinarySearchTree(BinarySearchTreeNode root, int level) {
        if (root == null) {
            return;
        }
        if (level == 1) {
            System.out.print(root.data + " ");
        } else if (level > 1) {
            printGivenLevelOfBinarySearchTree(root.left, level - 1);
            printGivenLevelOfBinarySearchTree(root.right, level - 1);
        }
    }

}
