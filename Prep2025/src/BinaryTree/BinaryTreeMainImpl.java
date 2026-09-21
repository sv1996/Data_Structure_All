package BinaryTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class TreeNode {
    int data;
    TreeNode left;
    TreeNode right;

    TreeNode(int d) {
        data = d;
        left = null;
        right = null;
    }
}

public class BinaryTreeMainImpl {

    public static void main(String[] args) {
        // Binary tree
        //          0
        //        /  \
        //       1    2
        //      / \   / \
        //     3   4 5   6
        //    /   / \
        //   7   8   9

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

    }

    static void printTreeLevelWise(TreeNode root) {
        // print the tree level wise using highest level first and then lowest level
        // get height of the tree
        int h = heightOfTree(root);
        for (int i = 1; i <= h; i++) {
            List<Integer> levelNodes = new ArrayList<>();
            printGivenLevel(root, i, levelNodes);
            System.out.println(levelNodes);
        }

    }

    private static void printGivenLevel(TreeNode root, int level, List<Integer> levelNodes) {
        if (root == null) return;
        if (level == 1) {
            levelNodes.add(root.data);
        } else if (level > 1) {
            printGivenLevel(root.left, level - 1, levelNodes);
            printGivenLevel(root.right, level - 1, levelNodes);
        }
    }

    public static int heightOfTree(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int leftHeight = heightOfTree(root.left);
        int rightHeight = heightOfTree(root.right);
        return Math.max(leftHeight, rightHeight) + 1;
    }
}
