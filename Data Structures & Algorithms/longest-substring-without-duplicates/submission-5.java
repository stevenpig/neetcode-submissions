class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        int max = 0;
        int left = 0;

        HashSet<Character> ss = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {

          //  count++;
            while (ss.contains(s.charAt(i))) {
                ss.remove(s.charAt(left));
                left++;
            }
            ss.add(s.charAt(i));
            max = Math.max(max, i - left + 1);
        }

        return max;

    }
}
