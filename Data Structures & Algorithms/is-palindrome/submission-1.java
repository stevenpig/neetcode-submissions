class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        StringBuilder forw = new StringBuilder();
        StringBuilder rev = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (Character.isAlphabetic(s.charAt(i)) || Character.isDigit(s.charAt(i))) {
                forw.append(s.charAt(i));
            }
        }

        for (int i = s.length() - 1; i >= 0; i--) {
            if (Character.isAlphabetic(s.charAt(i)) || Character.isDigit(s.charAt(i))) {
                rev.append(s.charAt(i));
            }
        }
        
        System.out.println(forw + " " + rev);
        return forw.toString().equals(rev.toString());
    }
}
