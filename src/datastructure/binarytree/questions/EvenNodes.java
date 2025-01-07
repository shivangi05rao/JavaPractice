package datastructure.binarytree.questions;

import java.util.concurrent.atomic.AtomicInteger;

public class EvenNodes {
    public static void main(String[] args) {
        AtomicInteger count = new AtomicInteger();
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
    }

    //write a program to count even nodes in tree.
    private static void even(TreeNode root, AtomicInteger count) {
        if (root == null) {
            return;
        }

        if (root.data % 2 == 0) {
            count.incrementAndGet();
        }
        even(root.left, count);
        even(root.right, count);
    }
}
