class Solution {
    public boolean isPalindrome(String s) {
        int i = 0;
        int n = s.length() - 1;
        while (i < n) {
            while (i < n && !Character.isLetterOrDigit(s.charAt(i))) {
                i++;
            }

            while (i < n && !Character.isLetterOrDigit(s.charAt(n))) {
                n--;
            }

            if (Character.toLowerCase(s.charAt(i)) != Character.toLowerCase(s.charAt(n))) {
                return false;
            }
            i++;
            n--;
        }

        return true;
    }
}