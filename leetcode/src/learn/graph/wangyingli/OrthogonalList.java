package learn.graph.wangyingli;

/**
 * https://www.cnblogs.com/wangyingli/p/5974508.html?utm_source=tuicool&utm_medium=referral
 * @author zhu
 *
 */
/**
 * 有向图的十字链表实现
 *
 */
public class OrthogonalList {
    
    private class EdgeNode {
        int tailVex;
        int headVex;
        EdgeNode headNext;
        EdgeNode tailNext;
        
        public EdgeNode(int tailVex, int headVex, EdgeNode headNext, EdgeNode tailNext) {
            super();
            this.tailVex = tailVex;
            this.headVex = headVex;
            this.headNext = headNext;
            this.tailNext = tailNext;
        }
        
    }
    
    private class VertexNode {
        int data;
        EdgeNode firstIn;
        EdgeNode firstOut;
    }
    
    private VertexNode[] vertexs;
    private int vertexsNum;
    private int edgesNum;
    
    public OrthogonalList(int[][] data, int vertexsNum) {
        this.vertexsNum = vertexsNum;
        this.edgesNum = data.length;
        vertexs = new VertexNode[vertexsNum];
        for (int i = 0; i < vertexs.length; i++) {
            vertexs[i] = new VertexNode();
            vertexs[i].data = i;        //
        }
        
        //关键
        for (int i = 0; i < data.length; i++) {
            int tail = data[i][0];
            int head = data[i][1];
            EdgeNode out = vertexs[tail].firstOut;
            EdgeNode in = vertexs[head].firstIn;
            EdgeNode eNode = new EdgeNode(tail,head,in,out);
            vertexs[tail].firstOut = eNode;
            vertexs[head].firstIn = eNode;
        }
        
    }
    
    //返回一个顶点的出度
    public int outDegree(int index) {
        int result = 0;
        EdgeNode current = vertexs[index].firstOut;
        while(current != null) {
            current = current.tailNext;
            result++;
        }
        return result;
    }
    
    //返回一个顶点的入度
    public int inDegree(int index) {
        int result = 0;
        EdgeNode current = vertexs[index].firstIn;
        while(current != null) {
            current = current.headNext;
            result++;
        }
        return result;
    }
    
    public static void main(String[] args) {
        int[][] data = {
                {0,3},
                {1,0},
                {1,2},
                {2,0},
                {2,1},
        };
        OrthogonalList orth = new OrthogonalList(data,4);
        System.out.println("顶点1的出度为" + orth.outDegree(1));
        System.out.println("顶点1的入度为" + orth.inDegree(1));
            
    }
}