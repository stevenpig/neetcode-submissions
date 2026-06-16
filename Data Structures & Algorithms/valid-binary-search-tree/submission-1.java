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
  public boolean isValidBST(TreeNode root) {

        if (root == null)
            return true;
        
        if (root.left == null && root.right == null)
            return true;
        
        return traverse(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    public boolean traverse(TreeNode node, int min, int max) {
        
        if (node.val <= min || node.val >= max)
            return false;
        
        boolean left = true;
        boolean right = true;
        
        if (node.left != null)
            left = traverse(node.left, min, node.val);
        
        if (node.right != null)
            right = traverse(node.right, node.val, max);
        
        return left && right;    
    }
}
