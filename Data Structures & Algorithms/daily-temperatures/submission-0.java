class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] o = new int[temperatures.length];
        ArrayDeque<Integer> temp = new ArrayDeque<Integer>();
        ArrayDeque<Integer> indexes = new ArrayDeque<Integer>();

        temp.push(temperatures[0]);
        indexes.push(0);
        for (int i = 1; i < temperatures.length; i++) {
            while (!temp.isEmpty() && temp.peek() < temperatures[i]) {
                temp.pop();
                int index = indexes.pop();
                o[index] =  i - index;
            }

            temp.push(temperatures[i]);
            indexes.push(i);
        }
        return o;
    }
}
