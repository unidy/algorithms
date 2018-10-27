package learn.queue;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Scenarios of Islands: 1. single island with only one vertex 2. Island with
 * multiple verterics
 * 
 * @author zhu
 *
 */
public class NumberOfIslands {

	public int numIslands(char[][] grid) {
		if (grid == null || grid.length == 0 || grid[0].length == 0) {
			return 0;
		}
		
		int nums = 0;
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[i].length; j++) {

				// '1' means land
				if (grid[i][j] == '1') {
					nums++;
					// traverse the grid starting with grid[i] by using BFS
					search(grid, i, j);
				}
			}
		}

		return nums;
	}

	private void search(char[][] grid, int i, int j) {

		if ((i < 0 || i >= grid.length) || (j < 0 || j >= grid[i].length) || grid[i][j] != '1') {
			return;
		}
		
		grid[i][j] = '0';
		search(grid, i - 1, j);	//Up
		search(grid, i + 1, j); //Down
		search(grid, i, j - 1); //Left
		search(grid, i, j + 1); //Right
	}
}

/**
 * https://leetcode.com/explore/learn/card/queue-stack/231/practical-application-queue/1374
 * 
 * Given a 2d grid map of '1's (land) and '0's (water), count the number of
 * islands. An island is surrounded by water and is formed by connecting
 * adjacent lands horizontally or vertically. You may assume all four edges of
 * the grid are all surrounded by water.
 * 
 * Example 1:
 * 
 * Input: 11110 11010 11000 00000
 * 
 * Output: 1 Example 2:
 * 
 * Input: 11000 11000 00100 00011
 * 
 * Output: 3
 **/