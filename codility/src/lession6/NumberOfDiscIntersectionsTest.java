package lession6;

import static org.junit.Assert.*;

import org.junit.Test;

public class NumberOfDiscIntersectionsTest {

	@Test
	public void test() {
		int[] a = {1, 5, 2, 1, 4, 0};
		assertEquals(11, NumberOfDiscIntersections.solution(a));
		System.out.println("");
		
		int[] b = {0, 0};
		assertEquals(0, NumberOfDiscIntersections.solution(b));
	}

}
