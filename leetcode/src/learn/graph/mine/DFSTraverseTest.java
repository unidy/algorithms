package learn.graph.mine;

import static org.junit.Assert.*;

import org.junit.Test;

import learn.graph.GraphData;
import learn.graph.Utils;

import java.util.*;

public class DFSTraverseTest {

	@Test
	public void test() {
		Utils.printAdjEdge(GraphData.adjEdge);

		Graph graph = new Graph(GraphData.V, GraphData.adjEdge);

		GraphUtils.printAdjList(graph.toAdjList());

		List<Integer> tree = DFSTraverse.traverse(graph, 0);

		System.out.println("DFS:");
		GraphUtils.printList(tree);
		System.out.println("");
		
		tree = DFSTraverse.traverse(graph, 1);

		System.out.println("DFS:");
		GraphUtils.printList(tree);
	}
}
