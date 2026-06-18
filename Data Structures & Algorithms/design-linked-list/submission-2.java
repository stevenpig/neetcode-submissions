class MyLinkedList {
   Node head = new Node(-1, null, null);
    Node tail = new Node(-1, null, null);

    public MyLinkedList() {
        head.next = tail;
        tail.prev = head;
    }
    public int get(int index) {

        int i = 0;
        Node cur = head.next;
        while (cur != null) {
            if (i == index) {
                return cur.val;
            }
            cur = cur.next;
            i++;
        }
        return -1;
    }

    public void addAtHead(int val) {

        Node newNode = new Node(val, null, null);
        
        Node tmp = head.next;
        head.next = newNode;
        newNode.prev = head;
        newNode.next = tmp;
                tmp.prev = newNode;
    }

    public void addAtTail(int val) {
        Node newNode = new Node(val, null, null);
        
        Node tmp = tail.prev;
        tail.prev = newNode;
        newNode.next = tail;
        newNode.prev = tmp;
                tmp.next = newNode;
    }

    public void addAtIndex(int index, int val) {

        int i = 0;
        Node cur = head.next;
        while (cur != null) {
            if (i == index) {
                Node newNode = new Node(val, null, null);
                Node prev = cur.prev;
                
                
                prev.next = newNode;
                newNode.prev = prev;
                newNode.next = cur;
                cur.prev = newNode;
                        
                break;
            }
            cur = cur.next;
            i++;
        }
    }

    public void deleteAtIndex(int index) {
        int i = 0;
        Node cur = head.next;
        while (cur != null && cur != head && cur != tail) {
            if (i == index) {
                Node prev = cur.prev;
                Node next = cur.next;
                
                prev.next = next;
                next.prev = prev;

                break;
            }
            cur = cur.next;
            i++;
        }
    }

    static class Node {
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