package others;

import static org.junit.Assert.*;

import org.junit.Test;

public class ReverseStringTest {
	private ReverseString reverseString = new ReverseString();

	@Test
	public void test() {
//		String r = "abc".substring(2, 2+1);
		String r = reverseString.solution("123 ABC");
		System.out.println("r=" + r);
		assertEquals("CBA 321", r); 
	}

}
