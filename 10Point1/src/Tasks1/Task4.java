package Tasks1;

import java.util.HashSet;

public class Task4 {
	private int maxRow = 0;
	private int maxCol = 0;
	private int[][] chess;
	private int minSteps 			= Integer.MAX_VALUE;
	private HashSet<Square> passed 	= new HashSet<Square>();
	private int[][] directions 		= new int[][]{{-2, -1}, {-2, 1}, {-1, -2}, {-1, 2}, {1, -2}, {1, 2}, {2, -1}, {2, 1}};

	public int solution(int[][] a) {
		chess 	= a;
		maxRow 	= a.length;
		maxCol 	= a[0].length;
		
		Square start 	= new Square(0, 0);
		Square end 		= new Square(maxRow - 1, maxCol - 1);
				
		passed.add(start);
		findPath(start, end, 0);
				
		return minSteps == Integer.MAX_VALUE ? -1 : minSteps;
	}
	
	private void findPath(Square current, Square end, int steps) {
		if (current.equals(end)) {
			minSteps = Math.min(steps, minSteps);
			return;
		}
		
		steps++;
		HashSet<Square> nexts = nextSquares(current);
		for(Square next : nexts) {
			if (!next.equals(end)) {
				passed.add(next);
			}
		}
		for(Square next : nexts) {
			findPath(next, end, steps);
		}
		
		passed.removeAll(nexts);
		steps--;
	}
	
	private HashSet<Square> nextSquares(Square start) {
		HashSet<Square> nexts = new HashSet<Square>();
		
		Square next;
		for(int i = 0; i < directions.length; i++) {
			next = new Square(start.row + directions[i][0], start.col + directions[i][1]);
			if (inBoard(next) && !next.equals(start) && !isAlreadyPassed(next)) {
				if (!isBlocked(next)) {
					nexts.add(next);
				}
			}
		}
		
		return nexts;
	}
	
	private boolean isAlreadyPassed(Square square) {
		for(Square pass : passed) {
			if (pass.equals(square)) return true;
		}
		
		return false;
	}
	
	private boolean inBoard(Square move) {
		if ((move.row >= 0 && move.row < maxRow)
			&& (move.col >= 0 && move.col < maxCol)) {
			return true;
		}
		return false;
	}
	
	private boolean isBlocked(Square move) {
		return chess[move.row][move.col] == 1 ? true : false;
	}
}

class Square {
	boolean block = false;
	int row;
	int col;
	
	public Square(int x, int y) {
		row = x;
		col = y;
	}
	
	@Override
	public String toString() {
		return "( " + row + ", " + col + ")";
	}
	
	@Override
	public  boolean equals(Object other) {
		if (other == null) return false;
	    if (other == this) return true;
	    if (!(other instanceof Square))return false;
	    
	    Square obj = (Square)other;
		if (this.row == obj.row && this.col == obj.col) {
			return true;
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		return new Integer(this.row).hashCode() + new Integer(this.col).hashCode();
	}
}