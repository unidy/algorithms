package array;

import static org.junit.Assert.*;

import org.junit.Test;

public class AddTwoNumbersTest {
	AddTwoNumbers addTwoNumbers = new AddTwoNumbers();

	@Test
	public void test() {
		ListNode l1 = init("243");
		ListNode l2 = init("564");
		
		ListNode r = addTwoNumbers.solution(l1, l2);
		print(r);
	}
	
	private ListNode init(String s) {
		ListNode result;

		char[] chars = s.toCharArray();
		result = new ListNode(Integer.parseInt(Character.toString(chars[0])));
		
		for(int i=1; i<chars.length; i++) {
			result.next = new ListNode(Integer.parseInt(Character.toString(chars[i])));
		}
		
		return result;
	}
	
	private void print(ListNode l) {
		while(l.next != null) {
			System.out.print(l.val);
		}
		System.out.println("");
	}
}
