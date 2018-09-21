package algorithms.c06;

import static org.junit.Assert.*;

import org.junit.Test;

public class TriangleTest {
	Triangle triangle = new Triangle();

	@Test
	public void test() {
		int[] a = null;
		assertEquals(0, triangle.solution(a));

		int[] b = {10, 2};
		assertEquals(0, triangle.solution(b));

		int[] c = {10, 2, 5, -1, 8, 20};
		assertEquals(1, triangle.solution(c));

		int[] d = {10, 50, 5, 1};
		assertEquals(0, triangle.solution(d));
		
		int[] e = {1, 1, 1, 1, 5, 5, 5};
		assertEquals(1, triangle.solution(e));
		
		int[] f = {Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE};
		assertEquals(1, triangle.solution(f));
	}

}
