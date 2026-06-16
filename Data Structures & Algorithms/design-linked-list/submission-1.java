class MyLinkedList {

        private Node head;
    private Node tail;


    public MyLinkedList() {
                head = new Node(-1, null, null);
        tail = new Node(-1, null, null);
                head.next = tail;
        tail.prev = head;
    }
    
     public int get(int index) {

        Node cur = head;
        int i = -1;
        while (cur != null) {
            if (i == index)
                return cur.val;
            cur = cur.next;
            i++;
        }
        return -1;
    }

    public void addAtHead(int val) {
        Node tmp = head.next;
        Node newNode = new Node(val, null, null);
        head.next = newNode;
        newNode.next = tmp;
        newNode.prev = head;
        tmp.prev = newNode;
    }

    public void addAtTail(int val) {
        Node tmp = tail.prev;
        Node newNode = new Node(val, null, null);
        tail.prev = newNode;
        newNode.prev = tmp;
        newNode.next = tail;
        tmp.next = newNode;
    }

    public void addAtIndex(int index, int val) {
        Node cur = head;
        int i = 0;
        while (cur != null) {
            if (i == index) {
                Node tmp = cur.next;
                Node newNode = new Node(val, null, null);
                cur.next = newNode;
                newNode.next = tmp;
                newNode.prev = cur;
                tmp.prev = newNode;
                break;
            }
            i++;
            cur = cur.next;
        }
    }

    public void deleteAtIndex(int index) {
        Node cur = head;
        int i = -1;
        while (cur != null) {
            if (cur == tail)
                return;
            if (i == index) {
                Node prevNode = cur.prev;
                Node nextNode = cur.next;

                prevNode.next = nextNode;
                nextNode.prev = prevNode;
                break;
            }
            i++;
            cur = cur.next;
        }
    }


    class Node {

        int val;
        Node prev;
        Node next;

        public Node(int val, Node prev, Node next) {
            this.val = val;
            this.prev = prev;
            this.next = next;
        }
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */