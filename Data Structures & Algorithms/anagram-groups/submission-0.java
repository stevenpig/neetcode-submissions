class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> m = new HashMap<>();

        for (String s: strs) {
            char[] chars = s.toCharArray();                
            Arrays.sort(chars);
            String sortedKey = String.valueOf(chars);
            if (m.containsKey(sortedKey)) {
                List<String> l = m.get(sortedKey);
                l.add(s);
            } else {
                List<String> l = new ArrayList();
                l.add(s);
                m.put(sortedKey, l);
            }
        }

        return m.values().stream().toList();
    }
}
