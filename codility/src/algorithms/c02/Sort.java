package algorithms.c02;

public class Sort {

	public static void selectionSort(int[] arr) {
		int N = arr.length;
		
		int min = arr[0];
		for (int i=0; i < N; i++) {
			min = i;
			
			for(int j=i+1; j< N; j++) {
				if (arr[j] < arr[min]) {
					min = j;
				}
			}
			
			swap(arr, i, min);			
		}
	}
	
	public static void insertionSort(int[] arr) {
		int N = arr.length;
		
		for(int i=1; i < N; i++) {
			for(int j=0; j < i; j++){
				if (arr[i] < arr[j]) {
					swap(arr, i, j);
					break;
				}
			}
		}
	}
	
	private static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
}
