package array;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class TwoSumTest {
	private TwoSum twoSum = new TwoSum();

	@Test
	public void test() {
		int[] A = {2, 7, 11, 15};
		int[] R = {0, 1};

		Assert.assertArrayEquals(R, twoSum.solution(A, 9));
	}

}
