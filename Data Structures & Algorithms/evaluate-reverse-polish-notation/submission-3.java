class Solution {
    public int evalRPN(String[] tokens) {
        Deque<Integer> stack = new ArrayDeque<Integer>();

        for (String t : tokens) {
            if (t.equals("+") || t.equals("-") || t.equals("*") || t.equals("/")) {
                int operand = stack.pop();
                switch (t) {
                    case "+":
                        operand += stack.pop();
                        break;
                    case "-":
                        operand = stack.pop() - operand;
                        break;
                    case "*":
                        operand *= stack.pop();
                        break;
                    case "/":
                        operand = stack.pop() / operand;
                        break;
                    default:
                }
                stack.push(operand);
            } else {
                stack.push(Integer.parseInt(t));
            }
        }
        return stack.pop();
    }
}

