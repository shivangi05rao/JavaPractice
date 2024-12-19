class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
}

public class TestVibhav {

    public static void main(String[] args) {

    }

    private int pathSum(TreeNode root, int targetSum) {
        if(root == null){
            return 0;
        }
        int count = 0;
        util(root, targetSum, count, 0);
        return count;
    }

    private void util(TreeNode root, int targetSum, int count, int sum) {
        if(root == null){
            return;
        }

        findPath(root, targetSum, count, sum);
        util(root.left, targetSum, count, sum);
        util(root.right, targetSum, count, sum);
    }

    private void findPath(TreeNode root, int targetSum, int count, int sum) {
        if (root == null) {
            return;
        }

        sum += root.val;
        if(sum == targetSum){
            count++;
        }

        findPath(root.left, targetSum, count, sum);
        sum -= root.val;
        findPath(root.right, targetSum, count, sum);
    }
}
