package lession6;

import static org.junit.Assert.*;

import org.junit.Test;

public class MaxProductOfThreeTest {
	public MaxProductOfThree tree = new MaxProductOfThree();

	@Test
	public void testSolution() {
		int[] a = {-3, 1, 2, -2, 5, 6};
		int result = tree.solution(a);
		
		assertEquals(60, result);
		
		int[] b = {1, 2, 3, 4, 5, 6};
		result = tree.solution(b);
		
		assertEquals(120, result);
		
		int[] c = {-5, -4, 0, 2, 4, 3};
		
		result = tree.solution(c);
		
		assertEquals(80, result);
		
		int[] d = {-3, 1, 2};
		result = tree.solution(d);
		
		assertEquals(-6, result);
		
		int[] e = {-5, -6, -4, -7, -10};
		assertEquals(-120, tree.solution(e));
		
		int[] f = {4, 7, 3, 2, 1, -3, -5};
		assertEquals(105, tree.solution(f));
	}

}
