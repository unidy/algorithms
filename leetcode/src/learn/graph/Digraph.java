package learn.graph;

/**
 * Directed Graph with Adjency 
 * 
 * @author zhu
 *
 */
public class Digraph {

	private int vertics;
	private int edges;
	private int[][] arc;
	
	public Digraph(int[][] data, int vertexsNum) {
		this.vertics = vertexsNum;
		this.edges = data.length;
		
		
	}
}
