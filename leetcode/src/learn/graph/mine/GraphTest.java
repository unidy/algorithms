package learn.graph.mine;

import static org.junit.Assert.*;

import org.junit.Ignore;
import org.junit.Test;

import learn.graph.GraphData;
import learn.graph.Utils;

public class GraphTest {

	@Test
//	@Ignore
	public void testAdjEdge() {
		Utils.printAdjEdge(GraphData.adjEdge);
		
		Graph graph = new Graph(GraphData.V, GraphData.adjEdge);
		
		GraphUtils.printAdjEdge(graph.toAdjEdge());
	}
	
	@Test
//	@Ignore
	public void testAdjEdge2() {
		Utils.printAdjEdge(GraphData.adjEdge);
		
		Graph graph = new Graph(GraphData.V, GraphData.adjEdge, false);
		
		GraphUtils.printAdjEdge(graph.toAdjEdge());
	}
	
	@Test
//	@Ignore
	public void testAdjMatrix() {
		Utils.printAdjMatrix(GraphData.adjMatrix);
		
		Graph graph = new Graph(GraphData.adjMatrix);
		
		GraphUtils.printAdjMatrix(graph.toAdjMatrix());
	}
	
	@Test
//	@Ignore
	public void testAdjList() {
		Utils.printAdjMatrix(GraphData.adjMatrix);
		Graph graph = new Graph(GraphData.adjMatrix);

		GraphUtils.printAdjList(graph.toAdjList());
	}
}
