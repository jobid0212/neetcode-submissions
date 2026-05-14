class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        HashMap<Integer, Integer> numsMap = new HashMap<Integer, Integer>();

        int solution;
        for (int i = 0; i < nums.length; i++) {
            solution = target - nums[i];
            if (numsMap.containsKey(solution)) {
                int[] indexes = {numsMap.get(solution), i};
                return indexes;
            } else {
                numsMap.put(nums[i], i);
            }
        }

        int[] noIndexes = {0,0}; 
        return noIndexes;
    }
}
