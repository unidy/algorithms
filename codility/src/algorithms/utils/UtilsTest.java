package algorithms.utils;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class UtilsTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testIsPrime() {
		int n = 11;
		System.out.println(n >> 1);
		
		assertEquals(Utils.isPrime(5), true);
	}
	
	@Test
	public void testSqrt() {
		assertEquals(Utils.sqrt(4), 2, 0.01);
	}

}
