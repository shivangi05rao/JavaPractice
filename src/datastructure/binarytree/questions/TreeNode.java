package datastructure.binarytree.questions;

import java.util.concurrent.atomic.AtomicInteger;

//Traversal Orders
public class TreeNode {
    int data;
    TreeNode left;
    TreeNode right;

    TreeNode(int data) {
        this.data = data;
        left = null;
        right = null;
    }

    private void postOrder(TreeNode root) {
        if (root == null) {
            return;
        }

        postOrder(root.left);
        postOrder(root.right);
        System.out.println(root.data);
    }

    private void preOrder(TreeNode root) {
        if (root == null) {
            return;
        }

        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    private void InOrder(TreeNode root) {
        if (root == null) {
            return;
        }

        System.out.println(root.data);
        InOrder(root.left);
        InOrder(root.right);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.preOrder(root);
    }
}
// Representation of the input tree:
//     1
//    / \
//   2   3
//  / \
// 4   5






