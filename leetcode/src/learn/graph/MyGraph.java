package learn.graph;

import java.util.*;

/**
 * Graph without weight
 * @author zhu
 *
 */
public class MyGraph {
	int V;
	int[][] adjEdge;
	LinkedList<Integer>[] adjList;
	int[][] adjMatrix;

	public MyGraph(int V, int[][] adjEdge) {
		this.V = V;
		this.adjEdge = adjEdge;
	}
	
	public MyGraph(int V, LinkedList<Integer>[] adjList) {
		this.V = V;
		this.adjList = adjList;
	}
	
	public MyGraph(int[][] adjMatrix, int V) {
		this.V = V;
		this.adjMatrix = adjMatrix;
	}
	
	public static int[][] toAdjEdge(int[][] adjMatrix) {
		List<Edge> list = new ArrayList<>();
		for (int i=0; i < adjMatrix.length; i++) {
			for(int j=0; j < adjMatrix[i].length; j++) {
				if (adjMatrix[i][j] != 0) {
					list.add(new Edge(i, j, adjMatrix[i][j]));
				}
			}
		}
		
		int size = list.size();
		int[][] adjEdge = new int[size][3];
		Edge edge;
		for(int i=0; i < size; i++) {
			edge = list.get(i);
			adjEdge[i][0] = edge.src;
			adjEdge[i][1] = edge.desc;
			adjEdge[i][2] = edge.weight;
		}
		
		return adjEdge;
	}
	
	public static int[][] toAdjMatrix(int V, int[][] adjEdge) {
		return toAdjMatrix(V, adjEdge, false);
	}
	
	public static int[][] toAdjMatrix(int V, int[][] adjEdge, boolean directed) {
		if (V == 0 || adjEdge == null) {
			return null;
		}
		
		int[][] adjMatrix = new int[V][V];
		
		int row, col, weight;
		for(int i=0; i < adjEdge.length; i++) {
			row = adjEdge[i][0];
			col = adjEdge[i][1];
			weight = adjEdge[i][2];
			
			adjMatrix[row][col] = weight;
			if (directed) {
				adjMatrix[col][row] = weight;
			}
		}
		
		return adjMatrix;
	}
	
	public static HashMap<Integer, LinkedList<Integer[]>> toAdjList(int V, int[][] adjEdge) {
		if (V == 0 || adjEdge == null) {
			return null;
		}
		
		HashMap<Integer, LinkedList<Integer[]>> adjList = new HashMap<>();
		
		for (int i=0; i < V; i++) {
			adjList.put(i, new LinkedList<>());
		}
		
		Integer[] edge;
		for (int i=0; i < adjEdge.length; i++) {
			edge = new Integer[2];
			edge[0] = adjEdge[i][1];
			edge[1] = adjEdge[i][2];
			adjList.get(adjEdge[i][0]).add(edge);
		}
		
		return adjList;
	}
}
