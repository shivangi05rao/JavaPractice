package datastructure.binarytree.concepts;

public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
        left = null;
        right = null;
    }

    public static void display(TreeNode root) {
        if (root == null) {
            return;
        }

        System.out.print(root.val + " -> ");
        if (root.left != null) {
            System.out.print(root.left.val + ",");
        } else {
            System.out.print("null, " );
        }
        if (root.right != null) {
            System.out.print(root.right.val);
        } else {
            System.out.print("null ");
        }
        System.out.println();
        display(root.left);
        display(root.right);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(2);
        TreeNode a = new TreeNode(4);
        TreeNode b = new TreeNode(10);
        root.left = a;
        root.right = b;
        TreeNode c = new TreeNode(6);
        TreeNode d = new TreeNode(5);
        a.left = c;
        a.right = d;
        TreeNode e = new TreeNode(11);
        b.right = e;

        display(root);
    }
}

