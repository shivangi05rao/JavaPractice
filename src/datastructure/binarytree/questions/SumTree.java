package datastructure.binarytree.questions;

public class SumTree {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(26);
        root.left = new TreeNode(10);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(6);
        root.right.left = new TreeNode(3);
        System.out.println(getSumOfTree(root));
        System.out.println(isSumTree(root));
    }

    private static int getSumOfTree(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int l = getSumOfTree(root.left);
        int r = getSumOfTree(root.right);
        return root.data + l + r;
    }

    private static boolean isSumTree(TreeNode root) {
        if (root == null) {
            return true;
        }

        if (root.left == null && root.right == null) {
            return true;
        }

        boolean val1 = isSumTree(root.left);
        boolean val2 = isSumTree(root.right);

        int left = getSumOfTree(root.left);
        int right = getSumOfTree(root.right);

        if(left + right != root.data){
            return false;
        }

        return val1 && val2;
    }
}
