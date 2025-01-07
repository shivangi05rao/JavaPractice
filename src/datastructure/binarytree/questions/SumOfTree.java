package datastructure.binarytree.questions;

public class SumOfTree {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        System.out.println(getSumOfTree(root));
    }

    private static int getSumOfTree(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int l = getSumOfTree(root.left);
        int r = getSumOfTree(root.right);
        return root.data + l + r;
    }
}
