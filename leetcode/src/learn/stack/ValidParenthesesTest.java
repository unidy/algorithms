package learn.stack;

import static org.junit.Assert.*;

import org.junit.Test;

public class ValidParenthesesTest {
	ValidParentheses solution = new ValidParentheses();

	@Test
	public void test0() {		
		String s = "()";
		assertEquals(true, solution.isValid(s));
	}

	@Test
	public void test1() {		
		String s = "()[]{}";
		assertEquals(true, solution.isValid(s));
	}

	@Test
	public void test2() {		
		String s = "(]";
		assertEquals(false, solution.isValid(s));
	}

	@Test
	public void test3() {		
		String s = "([)]";
		assertEquals(false, solution.isValid(s));
	}

	@Test
	public void test4() {		
		String s = "{[]}";
		assertEquals(true, solution.isValid(s));
	}


	@Test
	public void test6() {		
		String s = null;
		assertEquals(true, solution.isValid(s));
	}
}
