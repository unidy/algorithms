package lession7;

import static org.junit.Assert.*;

import org.junit.Test;

public class BracketsTest {
	private Brackets brackets = new Brackets();
	
	@Test
	public void test() {
		assertEquals(1, brackets.solution(null));
		assertEquals(1, brackets.solution(""));

		String s = "{[()()]}";
		System.out.println(s);
		assertEquals(1, brackets.solution(s));
		
		s = "([)()]";
		System.out.println(s);
		assertEquals(0, brackets.solution(s));
		
		s = "())(()";
		System.out.println(s);
		assertEquals(0, brackets.solution(s));
	}

}
