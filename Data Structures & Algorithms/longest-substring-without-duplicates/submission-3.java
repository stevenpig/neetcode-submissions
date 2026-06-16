class Solution {
    public int lengthOfLongestSubstring(String s) {
        StringBuilder longest = new StringBuilder();
        HashMap<Integer, String> m = new HashMap<>();

        if (s.isEmpty())
            return 0;
        for (int i = 0; i < s.length(); i++) {
            if (!longest.toString().contains(String.valueOf(s.charAt(i)))) {
                longest.append(s.charAt(i));
            } else {
                m.put(longest.length(), longest.toString());
                i = i - longest.length();
                longest = new StringBuilder();

            }
        }

                        m.put(longest.length(), longest.toString());
        System.out.println(m);
        return m.keySet().stream()
                .mapToInt(Integer::intValue)
                .max()
                .getAsInt();
    }

}