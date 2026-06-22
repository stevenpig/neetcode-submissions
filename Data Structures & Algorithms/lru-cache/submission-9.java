class LRUCache {

    private LinkedList<Integer> l = new LinkedList<>();

    private int capacity;

    private HashMap<Integer, Integer> m = new HashMap<>();

    public LRUCache(int capacity) {
     this.capacity = capacity;
    }

    public int get(int key) {

        if (!m.containsKey(key))
            return -1;

              l.remove((Object) key);
        l.addFirst(key);

        return m.get(key);


    }

    public void put(int key, int value) {

        if (m.size() < capacity) {

              l.remove((Object) key);
  l.addFirst(key);
            m.put(key, value);
        } else {

            if (m.containsKey(key)) {
              l.remove((Object) key);
l.addFirst(key);
                m.put(key, value);
            } else {
                int remove = l.removeLast();
                m.remove(remove);
         l.addFirst(key);
                m.put(key, value);
            }
        }


    }
}
