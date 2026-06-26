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
    public List<Integer> preorderTraversal(TreeNode root) {
        ArrayList<Integer> r = new ArrayList<>();

        if (root == null)
            return r;

        traverse(root, r);
        

        return r;
    }

    public void traverse(TreeNode node, ArrayList<Integer> r) {
        if (node != null)
            r.add(node.val);

        if (node.left != null)
            traverse(node.left, r);

        if (node.right != null)
            traverse(node.right, r);    

    }
}