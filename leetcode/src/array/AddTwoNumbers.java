package array;

public class AddTwoNumbers {

	public ListNode solution(ListNode l1, ListNode l2) {
		ListNode temp;
		
		while(l1 != null || l2 != null) {
			
		}
		
		return l1;
	}
	
	public ListNode solution1(ListNode l1, ListNode l2) {
		StringBuffer s1 = new StringBuffer();
		StringBuffer s2 = new StringBuffer();
		
		ListNode next = l1;
		while(next != null) {
			s1.append(next.val);
			next = next.next;
		}
		next = l2;
		while(next != null) {
			s2.append(next.val);
			next = next.next;
		}
		
		long long1 = Long.valueOf(s1.reverse().toString());
		long long2 = Long.valueOf(s2.reverse().toString());
		char[] sum = new StringBuffer(String.valueOf(long1 + long2)).reverse().toString().toCharArray();
		
		ListNode result = new ListNode(Integer.parseInt(Character.toString(sum[0])));
		for(int i=1; i < sum.length; i++) {
			 result.next = new ListNode(Integer.parseInt(Character.toString(sum[i])));
		}
		
		return result;
	}
}

class ListNode {
	int val;
	ListNode next;

	ListNode(int x) {
		val = x;
	}
}