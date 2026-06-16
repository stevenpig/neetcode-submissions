class LRUCache {

     LinkedList<Integer> lru = new LinkedList<Integer>();
    Map<Integer, Integer> store = null;
    private int cap;
    public LRUCache(int capacity) {
        this.cap = capacity;
        this.store = new HashMap<>();
    }
    
    public int get(int key) {

        if (store.containsKey(key)) {
            lru.removeFirstOccurrence(key);
            lru.add(key);
            return store.get(key);
        } else
            return -1;
    }
    
    public void put(int key, int value) {


        if (!store.containsKey(key) && store.size() == cap) {
           Integer removed = lru.pollFirst();
           if (removed != null)
            store.remove(removed);
        }
        store.put(key, value);

        if (lru.contains(key)) {
            lru.removeFirstOccurrence(key);
        }
        lru.add(key);
    }
}
