package learn.stack;

/**
 * 
 * The point is to store the min value of current stack in each node.
 *
 */
public class MinStack2 {
	private Node head;

	public void push(int x) {
		if (head == null)
			head = new Node(x, x);
		else
			head = new Node(x, Math.min(x, head.min), head);
	}

	
	public void pop() {
		head = head.next;
		
		//TODO: need to release the current head
//		Node preHead = head;
//		head = preHead.next;
//		preHead = null;
	}

	public int top() {
		return head.val;
	}

	public int getMin() {
		return head.min;
	}

	private class Node {
		int val;
		int min;
		Node next;

		private Node(int val, int min) {
			this(val, min, null);
		}

		private Node(int val, int min, Node next) {
			this.val = val;
			this.min = min;
			this.next = next;
		}
	}
}

/**
https://leetcode.com/problems/min-stack/discuss/49010/Clean-6ms-Java-solution

*/