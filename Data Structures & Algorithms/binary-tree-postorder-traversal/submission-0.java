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
    public List<Integer> postorderTraversal(TreeNode root) {
        if (root == null)
            return new ArrayList<>();

        ArrayList<Integer> r = new ArrayList<>();

        traverse(root, r);

        return r;
        
    }

    public void traverse(TreeNode node, ArrayList<Integer> r) {

        if (node == null)
            return;

        if (node.left != null)
            traverse(node.left, r);

        if (node.right != null)
            traverse(node.right, r);

        r.add(node.val);    
    }
}