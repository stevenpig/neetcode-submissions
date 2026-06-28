class Solution {
    public List<String> stringMatching(String[] words) {
             Set<String> r = new HashSet<>();
        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words.length; j++) {
                if (words[j].contains(words[i]) && !words[j].equals(words[i]))
                    r.add(words[i]);
            }
        }
        return r.stream().toList();
    }
}