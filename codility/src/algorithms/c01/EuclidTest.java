package algorithms.c01;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class EuclidTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testGcb() {
//		assertEquals(Euclid.gcb(2, 0), 2);
//		
//		assertEquals(Euclid.gcb(10, 4), 2);
		
		assertEquals(Euclid.gcb(20, 9), 1);
	}

}
