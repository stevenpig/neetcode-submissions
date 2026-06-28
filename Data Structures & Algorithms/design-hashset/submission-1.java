class MyHashSet {
    Node[] nodes = new Node[5];
    public MyHashSet() {
        for (int i = 0; i < nodes.length; i++)
            nodes[i] = new Node();
    }

    public int getIndex(Integer key) {
        return Math.abs(key.hashCode()) % 5;
    }
    
    public void add(int key) {
        
        Node node = nodes[getIndex(key)];
        
        LinkedList<Integer> l = node.list;
        
        if (!l.contains(key))
            l.add(key);
    }

    public void remove(int key) {
        Node node = nodes[getIndex(key)];

        LinkedList<Integer> l = node.list;

        if (l.contains(key))
            l.remove(Integer.valueOf(key));
    }

    public boolean contains(int key) {
        Node node = nodes[getIndex(key)];
        LinkedList<Integer> l = node.list;
        return l.contains(key);
    }


    static class Node {
        LinkedList<Integer> list = new LinkedList<>();
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */