class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer>[] arr = new List[nums.length+1];

        for (int num: nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new ArrayList<>();
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            arr[entry.getValue()].add(entry.getKey());
        }

        int[] o = new int[k];
        int index = 0;
        for (int i = arr.length - 1; i > 0 && index < k; i--) {
            for (int num : arr[i]) {
                o[index++] = num;
                if (index == k) {
                    return o;
                }
            }
        }
        return o;
    }
}
