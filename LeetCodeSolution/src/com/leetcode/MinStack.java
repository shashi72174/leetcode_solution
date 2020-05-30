package com.leetcode;

class MinStack {

    /** initialize your data structure here. */
	Integer[] arr = {};
    int top=-1;
    public MinStack() {
        arr = new Integer[1000];
    }
    
    public void push(int x) {
    	top++;
        arr[top] = x;
        
    }
    
    public void pop() {
        System.out.println(arr[top]);
        arr[top]=null;
        top--;
    }
    
    public int top() {
        return arr[top];
    }
    
    public int getMin() {
    	Integer min=arr[0];
        for(int i=1;i<arr.length;i++) {
            if(arr[i]!=null && arr[i]<min)
                min=arr[i];
        }
        return min;
    }
    
    public static void main(String[] args) {
    	MinStack minStack = new MinStack();
    	minStack.push(-2);
    	minStack.push(0);
    	minStack.push(-3);
    	System.out.println(minStack.getMin()); // return -3
    	minStack.pop();
    	System.out.println(minStack.top());    // return 0
    	System.out.println(minStack.getMin()); // return -2
	}
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */