class Solution {
    public boolean isPalindrome(String s) {
        int size = s.length();
        s = s.toLowerCase();
        for (int i = 0; i < size/2; i++) {
            if (s.charAt(i) == s.charAt(size - i - 1)) continue;
            else return false;
        }
        if (size % 2 == 0 && s.charAt(size/2) == s.charAt(size/2 - 1)) return true;
        else if (size % 2 == 0 && s.charAt(size/2) != s.charAt(size/2 - 1)) return false;
        else return true;
    }
}
