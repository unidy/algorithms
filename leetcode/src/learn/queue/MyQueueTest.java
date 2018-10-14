package learn.queue;

import static org.junit.Assert.*;

import org.junit.Test;

public class MyQueueTest {
	MyQueue queue = new MyQueue();

	@Test
	public void test() {
		queue.push(1);
		queue.push(2);
		
		assertEquals(1, queue.peek());
		assertEquals(1, queue.pop());
		assertEquals(2, queue.pop());
		assertEquals(true, queue.isEmpty());
	}

}
