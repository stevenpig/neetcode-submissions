class MinStack {

   Stack<Integer> st = null;

    Stack<Integer> minSt = null;

    public MinStack() {
        st = new Stack<>();
        minSt = new Stack<>();
    }

    public void push(int val) {

        if (minSt.isEmpty()) {
            minSt.push(val);
        } else {
            int minValue = minSt.peek();
            if (val <= minValue) {
                minSt.push(val);
            }
        }
        
        st.push(val);
    }

    public void pop() {

        if (st.isEmpty())
            return;

        int value = st.pop();        

        if (!minSt.isEmpty()) {
            int minValue = minSt.peek();
            if (minValue == value)
                minSt.pop();
        }
                
        if (!st.isEmpty()) {
            int newMinValue = st.peek();
            if (minSt.isEmpty() || minSt.peek() > newMinValue)
                minSt.push(newMinValue);
        }
        
    }

    public int top() {
        if (st.isEmpty())
            return -1;
        return st.peek();
    }

    public int getMin() {
        
        return minSt.isEmpty() ? -1 : minSt.peek();
    }
}
