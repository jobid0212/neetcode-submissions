class Solution {
    public boolean isAnagram(String s, String t) {
        char[] sArray = s.toCharArray();
        char[] tArray = t.toCharArray();

        Arrays.sort(sArray);
        Arrays.sort(tArray);

        String sortedS = new String(sArray);
        String sortedT = new String(tArray);

        if (sortedS.equals(sortedT)) {
            return true;
        } else {
            return false;
        }
    }
}
