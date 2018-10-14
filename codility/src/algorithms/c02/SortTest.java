package algorithms.c02;

import java.util.Random;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class SortTest {
	private static int N = 10;
	private int[] arr;
	
	@Before 
	public void setUp() throws Exception {
		arr = new int[N];
		Random generator = new Random(); 
		for(int i=0; i < N; i++) {
			arr[i] = generator.nextInt(N);
		}
		
		print(arr);
		
		System.out.println("---------------");
	}
	
	@Test
	@Ignore
	public void testSelectionSort() {
		Sort.selectionSort(arr);
		
		print(arr);
	}

	@Test
	public void testInsertionSort() {
		Sort.insertionSort(arr);
		
		print(arr);
	}

	public void print(int[] arr) {
		for(int i=0; i < N; i++) {
			System.out.println(i + ":" + arr[i]);
		}
	}
}
