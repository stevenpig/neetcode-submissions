class Solution {
    public boolean wordPattern(String pattern, String s) {
    String[] split = s.split(" ");

        Map<String, Set<Character>> m = new HashMap<>();
        Map<Character, Set<String>> m1 = new HashMap<>();

        if (pattern.length() != split.length)
            return false;
        for (int i = 0 ; i < split.length; i++) {
            Set<Character> match = m.getOrDefault(split[i], new HashSet<>());
            match.add(pattern.charAt(i));
            m.put(split[i], match);

            Set<String> match1 = m1.getOrDefault(pattern.charAt(i), new HashSet<>());
            match1.add(split[i]);
            m1.put(pattern.charAt(i), match1);
        }

        return
                m.entrySet().stream().noneMatch(e -> e.getValue().size() > 1) &&
        m1.entrySet().stream().noneMatch(e -> e.getValue().size() > 1);
        
    }
}