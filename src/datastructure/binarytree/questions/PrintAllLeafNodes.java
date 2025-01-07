package datastructure.binarytree.questions;

import java.util.concurrent.atomic.AtomicInteger;

public class PrintAllLeafNodes {
    public static void main(String[] args) {
        AtomicInteger count = new AtomicInteger();
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        printLeafNodes(root);
    }

    //print all leaf nodes
    private static void printLeafNodes(TreeNode root) {
        if (root == null){
            return;
        }

        if (root.left == null && root.right == null) {
            System.out.print(root.data + " ");
        }
        printLeafNodes(root.left);
        printLeafNodes(root.right);
    }
}
