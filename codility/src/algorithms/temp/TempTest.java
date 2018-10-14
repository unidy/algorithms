package algorithms.temp;

import static org.junit.Assert.*;

import org.junit.Test;

public class TempTest {
	Temp temp = new Temp();

	@Test
	public void test() {
		int[] A = {1, 3, 5, 7};
		int[] B = {2, 9, 10, 20};
		System.out.println("{1, 3, 5, 7} {2, 9, 10, 20}");
		
		int[] C = temp.merge(A, B);
		print(C);
		
		
	}

	@Test
	public void testFindDuplicates() {
		int[] A = {1, 2, 3, 3, 5, 5, 6};
		System.out.println(temp.duplicates(A));
		System.out.println(temp.duplicates2(A));

		int[] B = {1, 2, 3, 4, 5, 7, 6};
		System.out.println(temp.duplicates(B));
		System.out.println(temp.duplicates2(B));
		
		int[] C = {0,2,0,1,3,3};
		System.out.println(temp.duplicates(C));
		System.out.println(temp.duplicates2(C));
		
		int[] D = {1, 21, -4, 103, 21, 4, 1};
		System.out.println(temp.duplicates(D));
		System.out.println(temp.duplicates2(D));
	}
	
	private void print(int[] a) {

		for (int i = 0 ; i < a.length; i++) {
			System.out.print(a[i] + ",");
		}
		System.out.println("");
	}
}
