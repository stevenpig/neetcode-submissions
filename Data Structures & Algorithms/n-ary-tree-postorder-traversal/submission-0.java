/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
}
*/

class Solution {
 public List<Integer> postorder(Node root) {

        ArrayList<Integer> r = new ArrayList<>();

        if (root == null)
            return r;
        traverse(root, root.val, r);    

        return r;
    }

    private void traverse(Node root, int val, ArrayList<Integer> r) {

        for (Node c: root.children) {
            traverse(c, c.val, r);
        }

        r.add(val);
    }
}