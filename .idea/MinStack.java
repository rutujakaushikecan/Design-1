/*
Intuition : as this is requires min element - using PriorityQueue (min heap)
Time Complexity : O(log(n))
Space Complexity : O(n)
*/

class MinStack {

    PriorityQueue<Integer> p;
    Stack<Integer> stack;

    public MinStack() {
        p = new PriorityQueue<Integer>();
        stack = new Stack<Integer>();
    }

    public void push(int val) {
        p.add(val);
        stack.push(val);
    }

    public void pop() {
        p.remove(stack.pop());
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return p.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */