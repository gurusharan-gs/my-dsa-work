package sorting;

import java.util.Arrays;

public class BubbleSort {

	static void bubbleSort(int[] arr) {

		int n = arr.length;

		// in this bubble sort code tc O(n^2)
		//  sc O(1)
		//  tc O(n^2) --> best case, in the sorting array that time O(n) 
	    //  tc O(n^2) --> average case
	    //  tc O(n^2) --> worst case
		
		for (int i = 0; i < n - 1; i++) {
			boolean flag = false;
			for (int j = 0; j < n - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					flag = true;
				}
			}
			if (!flag) {
				return;
			}
		}
	}

	public static void main(String[] args) {
		int[] arr = { 5, 2, 3, 4, 1 };
		bubbleSort(arr);
		System.out.println(Arrays.toString(arr));

	}

}
