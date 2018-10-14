package learn.graph.wangyingli;

/**
 * https://www.cnblogs.com/wangyingli/p/5974508.html?utm_source=tuicool&utm_medium=referral
 * @author zhu
 *
 */
public class DFSTraverse {
	public boolean[] visited;
    
    //从顶点index开始遍历
    public DFSTraverse(Digraph graph, int index) {
        visited = new boolean[graph.getVertexsNum()];
        dfs(graph,index);
    }

    private void dfs(Digraph graph, int index) {
    	System.out.println(index);
        visited[index] = true;
        for(int i : graph.adj(index)) {
            if(!visited[i])
                dfs(graph,i);   
        }
    }
    
    public static void main(String[] args) {
    	int[][] data = {
                {0,3},
                {1,0},
                {1,2},
                {2,0},
                {2,1},
        };
        Digraph graph = new Digraph(data,4);
        
    	DFSTraverse dfs = new DFSTraverse(graph, 1);
    	
//    	for (int i=0; i < dfs.visited.length; i++) {
//    		System.out.println(dfs.visited[i]);
//    	}
    	
    }
}
