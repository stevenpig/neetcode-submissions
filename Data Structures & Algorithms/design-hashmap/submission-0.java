

class MyHashMap {

   Node[] nodes = new Node[5];

    public MyHashMap() {
        for (int i = 0; i < 5; i++)
            nodes[i] = new Node();
    }

    public int getIndex(Integer key) {
        int code = Math.abs(key.hashCode()) % 5;
        return code;
    }

    public void put(int key, int value) {
        int index = getIndex(key);

        LinkedList<Map.Entry<Integer, Integer>> l = nodes[index].list;

              Map.Entry<Integer, Integer> newE = Map.entry(key, value);
        for (Map.Entry<Integer, Integer> e: l) {
            if (e.getKey() == key) {
                l.remove(e);
                l.add(newE);
                return;
            }
        }

        l.add(newE);
    }

    public int get(int key) {
        int index = getIndex(key);
        LinkedList<Map.Entry<Integer, Integer>> l = nodes[index].list;
        
        for (Map.Entry<Integer, Integer> e: l) {
            if (e.getKey().equals(key))
                return e.getValue();
        }
        
        return -1;
        
    }

    public void remove(int key) {
        int index = getIndex(key);

        LinkedList<Map.Entry<Integer, Integer>> l = nodes[index].list;
        for (Map.Entry<Integer, Integer> e: l) {
            if (e.getKey().equals(key)) {
                l.remove(e);
                return;
            }
        }
        
    }

    class Node {
        LinkedList<Map.Entry<Integer, Integer>> list = new LinkedList<>();
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */


