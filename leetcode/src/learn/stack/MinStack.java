package learn.stack;

import java.util.*;
/**
 * There are two regular solutions.
 * 1. Use two stack
 *		List<Integer> stack = new ArrayList<>();
 *		List<Integer> minStack = new ArrayList<>();
 *	one is for regular stack, the other is for min value.
 *	
 * 2. Use one stack, and find the min value dynamically
 * 
 * Caution: ArrayList is not synchronized.
 * 
 * @author zhu
 *
 */
public class MinStack {

    /** initialize your data structure here. */
	private List<Integer> stack = new ArrayList<>(); 
	
	public MinStack() {
		
	}
	
	public void push(int x) {
		stack.add(x);
	}
	
	public void pop() {
		int size = stack.size();
		if (size < 1) {
			return;
		}
		stack.remove(size - 1);
	}
	
	public int top() {
		int size = stack.size();
		if (size == 0) {
			return -1;
		}
		return stack.get(size - 1);
	}
	
	public int getMin() {
		int min = Integer.MAX_VALUE;
		for(int i = 0; i < stack.size(); i++) {
			min = Math.min(stack.get(i), min);
		}
		
		return min;
	}
}

/**
https://leetcode.com/problems/min-stack/

Design a stack that supports push, pop, top, and retrieving the minimum element in constant time.

push(x) -- Push element x onto stack.
pop() -- Removes the element on top of the stack.
top() -- Get the top element.
getMin() -- Retrieve the minimum element in the stack.
Example:
MinStack minStack = new MinStack();
minStack.push(-2);
minStack.push(0);
minStack.push(-3);
minStack.getMin();   --> Returns -3.
minStack.pop();
minStack.top();      --> Returns 0.
minStack.getMin();   --> Returns -2.
 */
