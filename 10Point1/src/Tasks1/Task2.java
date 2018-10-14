package Tasks1;

import java.util.Arrays;
import java.util.HashSet;

public class Task2 {

	public static void Test(){
		int[] A, B;
		int M, X, Y;
		
		A = new int[]{60, 80, 40};
		B = new int[]{2, 3, 5};
		M = 5;
		X = 2;
		Y = 200;
				
		System.out.println(solution(A, B, M, X, Y));
		
		A = new int[]{40, 40, 100, 80, 20};
		B = new int[]{3, 3, 2, 2, 3};
		M = 3;
		X = 5;
		Y = 200;
				
		System.out.println(solution(A, B, M, X, Y));
		
		A = new int[]{40};
		B = new int[]{2};
		M = 2;
		X = 1;
		Y = 40;
				
		System.out.println(solution(A, B, M, X, Y));
		
		A = new int[]{40};
		B = new int[]{2};
		M = 2;
		X = 2;
		Y = 80;
				
		System.out.println(solution(A, B, M, X, Y));
		
		A = new int[]{40};
		B = new int[]{2};
		M = 2;
		X = 1;
		Y = 80;
				
		System.out.println(solution(A, B, M, X, Y));
	}
	
	
	public static int solution(int[] A, int[] B, int M, int X, int Y) {
		int stops = 0;
		
		int endPositon = 0;
		for(int startPosition = 0; startPosition < A.length; ) {
			endPositon = loadPersons(A, startPosition, X, Y);
			stops += countStops(B, startPosition, endPositon);
			startPosition = endPositon + 1;
		}
		
		return stops;
	}

	
	public static int loadPersons(int[] persons, int startPosition, int maxPersons, int maxWeights) {	
		int totalWeights = 0;
		int max = Math.min(startPosition + maxPersons, persons.length);
		for(int i = startPosition; i < max; i++) {
			totalWeights += persons[i];
			if (totalWeights > maxWeights) {
				return i - 1;
			}
		}
		
		return max - 1;
	}
	
	public static int countStops(int[] floors, int startPosition, int endPosition) {
		HashSet stops = new HashSet();
		
		for(int i = startPosition; i <= endPosition; i++) {
			stops.add(floors[i]);
		}
		
		return stops.size() + 1;
	}
	
	
	public static void testLoadPersons() {
		int[] A, B;
		int M, X, Y;
		
		A = new int[]{60, 80, 40};
		B = new int[]{2, 3, 5};
		M = 5;
		X = 2;
		Y = 200;
				
		System.out.println(loadPersons(A, 0, X, Y));
		

		A = new int[]{60, 200, 40};
		B = new int[]{2, 3, 5};
		M = 5;
		X = 2;
		Y = 200;
				
		System.out.println(loadPersons(A, 0, X, Y));
	}
	
	
}

class Args {
	int[] A;
	int[] B;
	int M;
	int X;
	int Y;
	
	public Args(int[] A, int[] B, int M, int X, int Y) {
		this.A = A;
		this.B = B;
		this.M = M;
		this.X = X;
		this.Y = Y;
	}
}