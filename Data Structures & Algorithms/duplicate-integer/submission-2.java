class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> appeared = new HashSet<Integer>();

        for (int num : nums) {
            if (appeared.contains(num)) {
                return true;
            }
            appeared.add(num);
        }

        return false;
    }
}