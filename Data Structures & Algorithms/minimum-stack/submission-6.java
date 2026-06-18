class MinStack {

    Stack<Integer> st1 = new Stack<>();
    Stack<Integer> st2 = new Stack<>();

    public MinStack() {
        
    }
    
    public void push(int val) {
        st1.push(val);

        if (st2.isEmpty() || st2.peek() >= val)
            st2.push(val);
    }
    
    public void pop() {
        if (!st1.isEmpty()) {
            int val = st1.pop();
            if (!st2.isEmpty() && val == st2.peek())
                st2.pop();
            
        }
    }
    
    public int top() {
        if (st1.isEmpty())
            return -1;
        return st1.peek();
    }
    
    public int getMin() {
        if (st2.isEmpty())
            return -1;
        return st2.peek();
    }
}
