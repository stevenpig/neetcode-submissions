class Solution {
    public boolean isValid(String s) {

        if (s.length() % 2 == 1)
            return false;

         Stack<Character> st = new Stack<>();

         for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '[')
                st.push(']');
            else if (s.charAt(i) == '(') {
                st.push(')');
            } else if (s.charAt(i) == '{') {
                st.push('}');
            } else {
                if (st.isEmpty())            
                    return false;
                char p = st.pop();
                if (p != s.charAt(i))
                    return false;
            }            
         }

         return st.isEmpty();
        
    }
}
