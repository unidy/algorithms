package algorithms.c01;

import org.junit.Test;

public class SumTest {

	@Test
	public void testTwoSum() {
		int[] arr = {1, -1, 3, 4, -3, -5, 5};
		System.out.println("Two Sum:" + Sum.twoSum(arr));
	}

	@Test
	public void testThreeSum() {
		int[] arr = {1, -1, 3, 4, -3, -5, 5};
		System.out.println("Three Sum:" + Sum.threeSum(arr));
	}

}
