package learn.stack;

import static org.junit.Assert.*;

import org.junit.Ignore;
import org.junit.Test;

import learn.utils.Print;

public class EvaluateReversePolishNotationTest {
	EvaluateReversePolishNotation solution = new EvaluateReversePolishNotation();

	@Test
//	@Ignore
	public void test01() {
		String[] tokens = {"2", "1", "+", "3", "*"};
		Print.print(tokens);
		
		assertEquals(9, solution.evalRPN(tokens));
	}

	@Test
//	@Ignore
	public void test02() {
		String[] tokens = {"4", "13", "5", "/", "+"};
		Print.print(tokens);
		
		assertEquals(6, solution.evalRPN(tokens));
	}

	@Test
//	@Ignore
	public void test03() {
		String[] tokens = {"10", "6", "9", "3", "+", "-11", "*", "/", "*", "17", "+", "5", "+"};
		Print.print(tokens);
		
		assertEquals(22, solution.evalRPN(tokens));
	}

	@Test
//	@Ignore
	public void test11() {
		String[] tokens = {"2", "1", "+", "3", "*"};
		Print.print(tokens);
		
		assertEquals(9, solution.evalRPN2(tokens));
	}

	@Test
//	@Ignore
	public void test12() {
		String[] tokens = {"4", "13", "5", "/", "+"};
		Print.print(tokens);
		
		assertEquals(6, solution.evalRPN2(tokens));
	}

	@Test
//	@Ignore
	public void test13() {
		String[] tokens = {"10", "6", "9", "3", "+", "-11", "*", "/", "*", "17", "+", "5", "+"};
		Print.print(tokens);
		
		assertEquals(22, solution.evalRPN2(tokens));
	}

}
