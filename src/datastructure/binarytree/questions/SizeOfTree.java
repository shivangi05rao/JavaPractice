package datastructure.binarytree.questions;

import java.util.concurrent.atomic.AtomicInteger;

public class SizeOfTree {
    public static void main(String[] args) {
        AtomicInteger count = new AtomicInteger();
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        SizeOfTree sizeOfTree = new SizeOfTree();
        sizeOfTree.size(root, count);
        System.out.println(count.get());
    }

    private void size(TreeNode root, AtomicInteger count) {
        if (root == null) {
            return;
        }

        count.incrementAndGet();
        size(root.left, count);
        size(root.right, count);
    }

}
