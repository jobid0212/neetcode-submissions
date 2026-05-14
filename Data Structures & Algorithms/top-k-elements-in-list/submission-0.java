class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int[] o = new int[k];
        Map<Integer, Integer> frequency = new HashMap<Integer, Integer>();
        for (int num : nums) {
            frequency.put(num, frequency.getOrDefault(num, 0) + 1);
        }
        for (int i = 0; i < k; i++) {
            int max = 0;
            int maxNum = 0;
            for (int key : frequency.keySet()) {
                if (frequency.get(key) > max) {
                    max = frequency.get(key);
                    maxNum = key;
                }
            }
            o[i] = maxNum;
            frequency.remove(maxNum);
        }
        return o;
    }
}
