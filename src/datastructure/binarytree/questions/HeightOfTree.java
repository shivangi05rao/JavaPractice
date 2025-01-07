package datastructure.binarytree.questions;

import java.util.concurrent.atomic.AtomicInteger;

public class HeightOfTree {
    public static void main(String[] args) {
        AtomicInteger count = new AtomicInteger();
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        System.out.println(heightOfTree(root));
    }

    //height of tree
    private static int heightOfTree(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int l = heightOfTree(root.left);
        int r = heightOfTree(root.right);
        if (l > r) {
            return l + 1;
        } else {
            return r + 1;
        }
    }
}
