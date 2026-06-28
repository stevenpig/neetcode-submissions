class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
         Set<Character> aS = new HashSet<>();
        
        for (char c: allowed.toCharArray())
            aS.add(c);
        
        int count = 0;
        for (int i = 0; i < words.length; i++) {
            Set<Character> fS = new HashSet<>();
            for (char c: words[i].toCharArray())
                fS.add(c);
            
            fS.removeAll(aS);
            
            if (fS.isEmpty())
                count++;
        }
        
        return count;
    }
}