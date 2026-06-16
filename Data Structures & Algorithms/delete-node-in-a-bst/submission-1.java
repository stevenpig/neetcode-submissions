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
    public TreeNode deleteNode(TreeNode root, int key) {
        
        return delete(root, key); 


    }

    private TreeNode findMin(TreeNode node) {
        TreeNode cur = node;

        while (cur.left != null) {
            cur = cur.left;
        }

        return cur;
    }

    private TreeNode delete(TreeNode node, int val) {

        if (node.val == val) {
            if (node.right != null) {

                // find the minmum of right sub tree
                TreeNode minNode = findMin(node.right);
                node.val = minNode.val;
                node.right = delete(node.right, minNode.val);
            } else if (node.left != null) {
                node = node.left;
            } else {
                node = null;
            }

        } else {
            if (node.left != null)
                node.left = delete(node.left, val);

            if (node.right != null)
                node.right = delete(node.right, val);
        }

        return node;

    }
}