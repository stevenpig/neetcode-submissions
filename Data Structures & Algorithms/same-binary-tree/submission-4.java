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
   public boolean isSameTree(TreeNode p, TreeNode q) {

        return traverse(p, q);
    }

    public boolean traverse(TreeNode n1, TreeNode n2) {
        
        if (n1 == null && n2 == null)
            return true;

        if ((n1 == null && n2!= null) || (n1 != null && n2 == null))
            return false;


        if(n1.left == null && n2.left == null && n1.right == null && n2.right == null)
            return n1.val == n2.val;

        
        boolean left = traverse(n1.left, n2.left);
        boolean middle = n1.val == n2.val;
        boolean right = traverse(n1.right, n2.right);
        return  left && right && middle;
    }
}
