class Solution {
    public boolean isAnagram(String s, String t) {
        char[] an1 = new char[26];
        char[] an2 = new char[26];

        for (int i = 0; i < s.length(); i++) {
            an1[s.charAt(i) - 'a'] += 1;
        }

        for (int i = 0; i < t.length(); i++) {
            an2[t.charAt(i) - 'a'] += 1;
        }

        for (int i = 0; i < an1.length; i++) {
            if (an1[i] != an2[i])
                return false;
        }

        return true;
    }
}
