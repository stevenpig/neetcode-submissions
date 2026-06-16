class Solution {
    public int reverse(int x) {

        String s = String.valueOf(x);
        StringBuilder sb = new StringBuilder();

        try {
            if (s.contains("-"))
                return Integer.valueOf("-" + sb.append(s.replace("-", "")).reverse().toString());
            else
                return Integer.valueOf(sb.append(s).reverse().toString());
        } catch (Exception e) {
            return 0;
        }
        
    }
}
