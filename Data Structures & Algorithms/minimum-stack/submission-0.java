class MinStack {

    List<Integer> stack; 
    PriorityQueue<Integer> minAccessor = new PriorityQueue<>();

    public MinStack() {
        this.stack = new ArrayList<Integer>();
    }
    
    public void push(int val) {
        this.stack.add(0, val);
        this.minAccessor.add(val);
    }
    
    public void pop() {
        int val = this.stack.remove(0);
        this.minAccessor.remove(val);
    }
    
    public int top() {
        return stack.get(0);
    }
    
    public int getMin() {
        return this.minAccessor.peek();
    }
}
