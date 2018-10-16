package learn.graph.mine;

import static org.junit.Assert.*;
import java.util.*;

import org.junit.Ignore;
import org.junit.Test;

import learn.graph.GraphData;
import learn.graph.Utils;

public class MSTTest {

	@Test
	@Ignore
	public void test() {
		Utils.printAdjMatrix(GraphData.adjMatrix);
		Graph graph = new Graph(GraphData.adjMatrix);
		List<Edge> adjEdge =  graph.toAdjEdge();
		GraphUtils.printAdjEdge(adjEdge);
		
		List<Edge> edges = MST.prim(graph);
		
		GraphUtils.printAdjEdge(edges);
	}
	
	@Test
//	@Ignore
	public void test2() {
		Utils.printAdjEdge(GraphData.adjEdge);
		Graph graph = new Graph(GraphData.V, GraphData.adjEdge, false);
		List<Edge> adjEdge =  graph.toAdjEdge();
		GraphUtils.printAdjEdge(adjEdge);
		
		List<Edge> edges = MST.prim(graph);
		
		GraphUtils.printAdjEdge(edges);
	}
}
