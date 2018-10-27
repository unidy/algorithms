package learn.stack;

import static org.junit.Assert.*;

import org.junit.Test;

public class MinStackTest {

	@Test
	public void test() {
		MinStack minStack = new MinStack();
		
		minStack.push(-2);
		minStack.push(0);
		minStack.push(-3);
		assertEquals(-3, minStack.getMin()); 
		minStack.pop();
		minStack.top();
		assertEquals(-2, minStack.getMin());
	}

	@Test
	public void test2() {
		MinStack1 minStack = new MinStack1();
		
		minStack.push(-2);
		minStack.push(0);
		minStack.push(-3);
		assertEquals(-3, minStack.getMin()); 
		minStack.pop();
		minStack.top();
		assertEquals(-2, minStack.getMin());
	}

}
