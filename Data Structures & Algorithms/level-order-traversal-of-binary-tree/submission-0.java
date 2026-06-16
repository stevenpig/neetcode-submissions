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
    public List<List<Integer>> levelOrder(TreeNode root) {
        
 List<List<Integer>> res = new ArrayList<>();


        ArrayDeque<TreeNode> q = new ArrayDeque<>();
        if (root != null) {
            q.add(root);

        }

        while (!q.isEmpty()) {
            List<Integer> l = new ArrayList<>();
            int curSize = q.size();
            for (int i =0 ; i< curSize; i++) {
                TreeNode cur = q.removeFirst();
                l.add(cur.val);

                if (cur.left != null) {
                    q.add(cur.left);
                }

                if (cur.right != null) {
                    q.add(cur.right);
                }
            }

            System.out.println(l);
            res.add(l);
        }





        return res;
    }
}
