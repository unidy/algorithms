package learn.queue;

import static org.junit.Assert.*;

import org.junit.Test;

public class MyCircularQueueTest {
	MyCircularQueue2 queue = new MyCircularQueue2(3);

	@Test
	public void test() {
		assertEquals(true, queue.enQueue(1));
		assertEquals(true, queue.enQueue(2));
		assertEquals(true, queue.enQueue(3));
		assertEquals(false, queue.enQueue(4));
		
		
		assertEquals(3, queue.rear());		
		assertEquals(true, queue.isFull());
		assertEquals(true, queue.deQueue());
		assertEquals(true, queue.enQueue(4));	
		assertEquals(4, queue.rear());		
	}

}
