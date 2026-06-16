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
    public int kthSmallest(TreeNode root, int k) {

        List<Integer> l = new ArrayList<>();

        search (root, k, l);
        
        System.out.println(l);
        if (l.size() >= k)
            return l.get(k - 1);

        else
            return -1;
        
    }

    private void search(TreeNode root, int k, List<Integer> l) {

        if (root == null) {
            return;
        }

        
        if (root.left != null)
            search(root.left, k, l);


        l.add(root.val);

        if (root.right != null)
            search(root.right, k, l);

        
    }


}
