package lession6;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class DistinctTest {

	@Test
	public void testSolution() {
		int[] a = {2, 1, 1, 2, 3, 1};
		int result = Distinct.solution(a);

		assertEquals(3, result);
	}

}
