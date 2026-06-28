/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean hasPathSum(TreeNode root, int targetSum) {

        if (root ==  null)
            return false;

        return sum(root, 0, targetSum);
    }

    public boolean sum(TreeNode node, int num, int targetSum) {

        if (node.left == null && node.right == null) {

            System.out.println("left: " + num + " val: " + node.val +" right: "+targetSum);
            return (num + node.val) == targetSum;
        }

        boolean left = false;
        boolean right = false;
        if (node.left != null)
            left = left || sum(node.left, num + node.val, targetSum) ;

        if (node.right != null)
            right = right || sum(node.right, num + node.val, targetSum) ;

        System.out.println("left: " + left + " right: " + right);
        return left || right;
    }
}