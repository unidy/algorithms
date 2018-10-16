package learn.graph.mine;

import java.util.*;

/**
 * Graph
 * 
 * @author zhu
 *
 */
public class Graph {
	int V;
	List<Edge> edges = new ArrayList<>();

	/**
	 * { {0, 3, 1}, {1, 0, 1}, {1, 2, 1}, {2, 0, 1}, {2, 1, 1}, };
	 * 
	 * @param V
	 * @param adjEdge
	 */
	public Graph(int V, int[][] adjEdge) {
		new Graph(V, adjEdge, true);
	}
	
	public Graph(int V, int[][] adjEdge, boolean directed) {
		this.V = V;
		Edge edge, edge2;
		for (int i = 0; i < adjEdge.length; i++) {
			edge = new Edge(adjEdge[i]);
			this.edges.add(edge);
			if (!directed) {
				edge2 = new Edge(adjEdge[i][1], adjEdge[i][0], adjEdge[i][2]);
				this.edges.add(edge2);
			}
		}
	}

	/**
	 * @param adjMatrix
	 */
	public Graph(int[][] adjMatrix) {
		this.V = adjMatrix.length;

		for (int i = 0; i < adjMatrix.length; i++) {
			for (int j = 0; j < adjMatrix[i].length; j++) {
				if (adjMatrix[i][j] != 0) {
					edges.add(new Edge(i, j, adjMatrix[i][j]));
				}
			}
		}
	}

	/**
	 * 
	 * { [{0, 3, 1}], [{1, 0, 1}, {1, 2, 1}], [{2, 0, 1}, {2, 1, 1}], [] }
	 * 
	 * @param adjList
	 */
	public Graph(int[][][] adjList) {
		this.V = adjList.length;

		Edge edge;
		int[] v;
		for (int i = 0; i < adjList.length; i++) {
			for (int j = 0; j < adjList[i].length; j++) {
				v = adjList[i][j];
				edge = new Edge(v);
				this.edges.add(edge);
			}
		}
	}

	/**
	 * Convert to be Adjacency Edge
	 * @return
	 */
	public List<Edge> toAdjEdge() {
		return this.edges;
	}

	public int[][] toAdjMatrix() {
		return this.toAdjMatrix(false);
	}
	
	/**
	 * Convert to be Adjacency Matrix
	 * 
	 * @param directed
	 * @return
	 */
	public int[][] toAdjMatrix(boolean directed) {
		if (V == 0) {
			return null;
		}
		
		int[][] matrix = new int[V][V];
		
		Edge edge;
		for(int i=0; i < this.edges.size(); i++) {
			edge = this.edges.get(i);
			matrix[edge.src][edge.desc] = edge.weight;
			if (directed) {
				matrix[edge.desc][edge.src] = edge.weight;
			}
		}
		
		return matrix;
	}
	
	/**
	 * Convert to be Adjacency List
	 * 
	 * @return
	 */
	public List<LinkedList<Edge>> toAdjList() {
		if (V == 0) {
			return null;
		}
		
		List<LinkedList<Edge>> list = new ArrayList<>();
		for (int i=0; i < V; i++) {
			list.add(new LinkedList<>());
		}
		
		for (Edge edge: this.edges) {
			list.get(edge.src).add(edge);
		}
		
		return list;
	}
}
