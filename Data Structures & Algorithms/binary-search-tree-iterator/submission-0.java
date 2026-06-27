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
class BSTIterator {

    int cur = 0;

    ArrayList<Integer> r = new ArrayList<>();

    public BSTIterator(TreeNode root) {
        
        traverse(root, r);
    }
    
    public int next() {
        return r.get(cur++);
    }

    private void traverse(TreeNode node, ArrayList<Integer> r) {


        if (node.left != null) {
            traverse(node.left, r);
        }

        r.add(node.val);

        if (node.right != null)
            traverse(node.right, r);
    }
    
    public boolean hasNext() {
        return cur < r.size();
    }
}

/**
 * Your BSTIterator object will be instantiated and called as such:
 * BSTIterator obj = new BSTIterator(root);
 * int param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */