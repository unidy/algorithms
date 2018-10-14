package learn.graph;

import static org.junit.Assert.*;

import org.junit.Ignore;
import org.junit.Test;


public class GraphTest {
	int V = 4;
	int[][] adjEdge = GraphData.adjEdge;
	
	int[][] adjMatrix = GraphData.adjMatrix; 
		
	@Test
	@Ignore
	public void test2AdjMatrix() {
		Utils.printAdjEdge(adjEdge);

		int[][] adjMatrix = Graph.toAdjMatrix(V, adjEdge);
        Utils.printAdjMatrix(adjMatrix);
	}

	@Test
	@Ignore
	public void test2AdjList() {
		Utils.printAdjEdge(adjEdge);

		Utils.printAdjList(Graph.toAdjList(V, adjEdge));
	}
	
	@Test
	@Ignore
	public void testAdjMatrix2AdjEdge() {
		Utils.printAdjMatrix(adjMatrix);
		int[][] adjEdge = Graph.toAdjEdge(adjMatrix);
		Utils.printAdjEdge(adjEdge);
	}
	
	
	
	@Test
//	@Ignore
	public void test2AdjEdge() {
		Utils.printAdjEdge(adjEdge);
		
		Utils.printAdjEdge(Graph.toAdjEdge(Graph.toAdjMatrix(V, adjEdge)));
	}
}
