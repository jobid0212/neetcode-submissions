class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        HashMap<Integer, Integer> numsMap = new HashMap<Integer, Integer>();

        int solution;
        for (int i = 0; i < nums.length; i++) {
            solution = target - nums[i];
            if (numsMap.containsKey(solution)) {
                
                return new int[] {numsMap.get(solution), i};
            } else {
                numsMap.put(nums[i], i);
            }
        }

        return new int[] {};
    }
}
