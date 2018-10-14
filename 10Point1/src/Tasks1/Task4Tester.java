package Tasks1;

public class Task4Tester {

	public static void test() {
		int[][] a;

//		a = new int[][]{{0,0,0},{0,0,0}};
//		testSolution(a);
		
//		a = new int[][]{{0,0},{0,0}};
//		testSolution(a);
		
//		a = new int[][]{{0,0},{0,0},{0,0}};
//		testSolution(a);
		
		a = new int[][]{{0,0,0},{0,0,1},{1,0,0},{0,0,0}};
		testSolution(a);
		
		a = new int[][]{{0,0,0},{0,0,0},{0,1,0},{0,1,0}};
		testSolution(a);
		
		a = new int[][]{{0,0,0},{0,0,0},{0,0,0},{0,0,0}};
		testSolution(a);
	}
	
	public static void testSolution(int[][] a) {
		Task4 task = new Task4();

		System.out.println(task.solution(a));
	}

}
