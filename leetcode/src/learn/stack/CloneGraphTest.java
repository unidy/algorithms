package learn.stack;

import static org.junit.Assert.*;

import org.junit.Test;

import learn.utils.Print;

public class CloneGraphTest {
	CloneGraph solution = new CloneGraph();

	@Test
	public void test() {
		UndirectedGraphNode node0 = new UndirectedGraphNode(0);
		UndirectedGraphNode node1 = new UndirectedGraphNode(1);
		UndirectedGraphNode node2 = new UndirectedGraphNode(2);
		
		node0.neighbors.add(node1);
		node0.neighbors.add(node2);
		node1.neighbors.add(node2);
		node2.neighbors.add(node2);
		
		UndirectedGraphNode clone = solution.cloneGraph(node0);
		
		Print.print(clone.label);
	}

}
