class LRUCache {

    
    Map<Integer, Node> store = null;
    private int cap;
    private Node head;
    private Node tail;

    public LRUCache(int capacity) {
        this.cap = capacity;
        this.store = new HashMap<>();
        this.head = new Node(-1, -1, null, null);
        this.tail = new Node(-1, -1, null, null);

        this.head.next = tail;
        tail.prev = head;
    }
    
    public int get(int key) {
        
        if (!store.containsKey(key))
            return -1;
        else {
            Node curNode = store.get(key);
            Node newNode = new Node(key, curNode.value, null, null);
            removeFromList(curNode);
            addIntoList(newNode);
            store.put(key, newNode);
        }
        return store.get(key).value;
    }
    
    public void put(int key, int value) {

        System.out.println("put: " + key + " " + value); 
        Node newNode = new Node(key, value, null, null);
        if (store.containsKey(key)) {
             removeFromList(store.get(key));

        } else if (store.size() >= cap) {

            //remove least used )*tail

            Node removeNode = tail.prev;
            removeFromList(removeNode);
            store.remove(removeNode.key);
    
        }
        addIntoList(newNode);
        store.put(key, newNode);
    }

    private void addIntoList(Node newNode) {
        Node tmp = head.next;
        head.next = newNode;
        newNode.prev = head;
        newNode.next = tmp;
                tmp.prev = newNode;
    }

    private void removeFromList(Node cur) {

        Node prev = cur.prev;
        Node next = cur.next;
        prev.next = next;
        next.prev = prev;
    }
}

class Node {
    int key;
    int value;
    Node prev;
    Node next;

    Node(int key, int value, Node prev, Node next) {
        this.key = key;
        this.value = value;
        this.prev = prev;
        this.next = next;
    }
}