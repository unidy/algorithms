package com.stagwell.interview;

import static org.junit.Assert.*;

import org.junit.Test;

import Tasks1.Task1;
import Tasks1.Task2;

public class ReverserTest {
	Reverser reverser = new Reverser();

	@Test
	public void test() {

		int n = 213;
		
		assertEquals(321, reverser.solution(n));
		
		Task2.Test();
	}

}
