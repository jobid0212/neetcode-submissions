class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] o = new int[temperatures.length];
        ArrayDeque<Integer> indexes = new ArrayDeque<Integer>();

        indexes.push(0);
        for (int i = 1; i < temperatures.length; i++) {
            while (!indexes.isEmpty() && temperatures[indexes.peek()] < temperatures[i]) {
                int index = indexes.pop();
                o[index] =  i - index;
            }

            indexes.push(i);
        }
        return o;
    }
}
