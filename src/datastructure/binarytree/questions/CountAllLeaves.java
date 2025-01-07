package datastructure.binarytree.questions;

import java.util.concurrent.atomic.AtomicInteger;

public class CountAllLeaves {
    public static void main(String[] args) {
        AtomicInteger count = new AtomicInteger();
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        System.out.println(count.get());
    }

    //count all leaf nodes
    private static void countLeafNodes(TreeNode root, AtomicInteger count) {
        if (root == null){
            return;
        }

        if (root.left == null && root.right == null) {
            count.incrementAndGet();
        }
        countLeafNodes(root.left, count);
        countLeafNodes(root.right, count);
    }
}
