class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        Set<Integer> starters = new HashSet<>();

        for (int num : nums) {
            starters.add(num);
        }

        Set<Integer> set = Set.copyOf(starters);
        for (int num : nums) {
            if (set.contains(num - 1)) {
                starters.remove(num);
            }
        }

        int length = 1;
        int maxLength = length;
        for (int num : starters) {
            length = 1;
            while (set.contains(++num)) {
                length++;
            }
            if (length > maxLength) {
                maxLength = length;
            }
        }

        return maxLength;
    }
}
