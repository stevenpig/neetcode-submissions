class Solution {
    public int characterReplacement(String s, int k) {
 HashSet<Character> ss = new HashSet<>();
        for (char c: s.toCharArray())
            ss.add(c);

        int max = Integer.MIN_VALUE ;
        for (char c: ss) {
            int count = 0;
            int left= 0;
            Map<Character, Integer> cntM = new HashMap<>();
            for (int i = 0; i < s.length(); i++) {

                if (s.charAt(i) == c)
                    count++;
                
                while (i-left + 1 - count > k) {
                    
                    if (s.charAt(left) == c)
                        count--;
                    left++;
                }
                
                max = Math.max(max, i - left + 1);
            }    
        }
        
        
        return max == Integer.MIN_VALUE ? 0 : max;
    }
}
