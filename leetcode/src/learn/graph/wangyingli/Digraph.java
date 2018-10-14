package learn.graph.wangyingli;

import java.util.*;

/**
 * https://www.cnblogs.com/wangyingli/p/5974508.html?utm_source=tuicool&utm_medium=referral
 * @author zhu
 *
 */
/**
 * 有向图的邻接矩阵实现
 */
public class Digraph {
    private int vertexsNum;
    private int edgesNum;
    private int[][] arc;

    public Digraph(int[][] data, int vertexsNum) {
        this.vertexsNum = vertexsNum;
        this.edgesNum = data.length;
        arc = new int[vertexsNum][vertexsNum];
        for (int i = 0; i < vertexsNum; i++) {
            for (int j = 0; j < vertexsNum; j++) {
                arc[i][j] = Integer.MAX_VALUE;
            }
        }
        
        for (int i = 0; i < data.length; i++) {
            int tail = data[i][0];
            int head = data[i][1];
            arc[tail][head] = 1;
        }
    }
    
    //用于测试，返回一个顶点的邻接点
    public Iterable<Integer> adj(int vertex) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < vertexsNum; i++) {
            if (arc[vertex][i] != Integer.MAX_VALUE)
                set.add(i);
        }
        return set;
    }
    
    public int getVertexsNum() {
		return vertexsNum;
	}

	public void setVertexsNum(int vertexsNum) {
		this.vertexsNum = vertexsNum;
	}

	public int getEdgesNum() {
		return edgesNum;
	}

	public void setEdgesNum(int edgesNum) {
		this.edgesNum = edgesNum;
	}

	public int[][] getArc() {
		return arc;
	}

	public void setArc(int[][] arc) {
		this.arc = arc;
	}

	public static void main(String[] args) {
        int[][] data = {
                {0,3},
                {1,0},
                {1,2},
                {2,0},
                {2,1},
        };
        Digraph wd = new Digraph(data,4);
        for(int i :wd.adj(1)) {
            System.out.println(i);
        }   
    }
}
