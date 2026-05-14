class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] o = new int[nums.length];
        int product = 1;
        int zeroIndex = -1;

        for (int i = 0; i < nums.length; i++) {
            if (!(nums[i] == 0 && zeroIndex == -1)) {
                product *= nums[i];
            } else {
                zeroIndex = i;
            }
        }

        if (zeroIndex != -1) {
            o[zeroIndex] = product;
            return o;
        }

        for (int i = 0; i < nums.length; i++) {
            o[i] = product / nums[i];
        }

        return o;
    }
}  
