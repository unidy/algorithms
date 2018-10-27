package learn.queue;

import static org.junit.Assert.*;

import org.junit.Ignore;
import org.junit.Test;

public class NumberOfIslandsTest {
	NumberOfIslands island = new NumberOfIslands();
	

	@Test
//	@Ignore
	public void test1() {
		char[][] grid = {
				{'1', '1', '1', '1', '0'},
				{'1', '1', '0', '1', '0'},
				{'1', '1', '0', '0', '0'},
				{'0', '0', '0', '0', '0'}
		};
		
		assertEquals(1, island.numIslands(grid));
	}

	@Test
//	@Ignore
	public void test2() {
		char[][] grid = {
				{'1', '1', '0', '0', '0'},
				{'1', '1', '0', '0', '0'},
				{'1', '1', '0', '0', '0'},
				{'0', '0', '1', '0', '0'},
				{'0', '0', '0', '1', '1'}
		};
		
		assertEquals(3, island.numIslands(grid));
		
	}

	@Test
//	@Ignore
	public void test0() {
		char[][] grid = {
				{'0', '0', '0', '0', '0'},
				{'0', '0', '0', '0', '0'},
				{'0', '0', '0', '0', '0'},
				{'0', '0', '0', '0', '0'}
		};
		
		assertEquals(0, island.numIslands(grid));
	}

}
