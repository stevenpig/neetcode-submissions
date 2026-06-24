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
    
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if (root == null) return false;
        
        // If they match identically right here, we are done!
        if (isSameTree(root, subRoot)) return true;
        
        // Otherwise, SEARCH for the starting point in the left or right branches
        return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
    }

    // This function ONLY checks for an exact, identical structure copy. 
    // It will NEVER skip a mismatching node to look deeper.
    private boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) return true;
        if (p == null || q == null || p.val != q.val) return false;
        
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }



}
