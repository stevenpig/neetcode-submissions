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
    public int maxDepth(TreeNode root) {
        int left = 0;
        int right = 0;

        if (root == null) 
            return 0;
        if (root.left != null) {
            left = maxDepth(root.left);
        }

        if (root.right != null) {
            right = maxDepth(root.right);
        }

        
            if (left + 1 > right + 1) return left + 1;
            else return right +1 ;
            
    }
}
