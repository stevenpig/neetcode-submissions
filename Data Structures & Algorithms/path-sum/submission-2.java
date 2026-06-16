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
        Set<Integer> s = new HashSet<>();
        hasPathSum(root, targetSum, 0, s);
        return s.contains(targetSum);
    }

    public int hasPathSum(TreeNode root, int target, int sum, Set<Integer> s) {

        if (root == null) {
            return sum;
        }



        int leftSum = 0;
        int rightSum = 0;

        leftSum = hasPathSum(root.left, target, sum + root.val, s);

        rightSum = hasPathSum(root.right, target, sum + root.val, s);

        if (root.left == null && root.right == null) {
            s.add(leftSum);
          //  s.add(rightSum);
        }
        return sum;
    }
}