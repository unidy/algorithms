package learn.graph;

public class GraphData {
	public static int V = 4;
	public static int[][] adjEdge = {
            {0, 3, 1},
            {1, 0, 2},
            {1, 2, 4},
            {2, 0, 5},
            {2, 1, 4},
    };
	
	public static int[][] adjMatrix = new int[][] 
		{
			{0, 2, 0, 6, 0}, 
			{2, 0, 3, 8, 5}, 
			{0, 3, 0, 0, 7}, 
			{6, 8, 0, 0, 9}, 
			{0, 5, 7, 9, 0}
		}; 
}
