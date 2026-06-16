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
    public List<Integer> rightSideView(TreeNode root) {
    ArrayDeque<TreeNode> q = new ArrayDeque<>();

        if (root == null) {
            return Collections.emptyList();
        }

        q.push(root);
        List<Integer> l = new ArrayList<>();

        while (!q.isEmpty()) {


            int size = q.size();
                            TreeNode cur = q.peekLast();
                l.add(cur.val);
            for (int i = 0; i < size; i++) {

                
                cur = q.removeFirst();
                if (cur.left != null)
                    q.add(cur.left);
                
                if (cur.right != null)
                    q.add(cur.right);
            }
        }

        return l;
        
    }
}
