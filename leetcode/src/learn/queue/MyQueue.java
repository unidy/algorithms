package learn.queue;

import java.util.Stack;

public class MyQueue {
	private Stack<Integer> stack = new Stack<>();
	
	public MyQueue() {
		
	}
	
	/**
	 * Push element x to the back of queue
	 * @param x
	 */
	public void push(int x) {
		stack.add(0, x);
	}
	
	/**
	 * Removes the element from in front of the queue and return element
	 * @return
	 */
	public int pop() {
		return stack.pop();
	}
	
	/**
	 * Returns element from in front of queue
	 * @return
	 */
	public int peek() {
		return stack.peek();
	}
	
	/**
	 * Return whether the queue is empty
	 * @return
	 */
	public boolean isEmpty() {
		return stack.isEmpty();
	}
}
