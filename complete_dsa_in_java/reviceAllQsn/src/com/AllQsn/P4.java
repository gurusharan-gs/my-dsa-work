package com.AllQsn;

public class P4 {
	static void reverseArray(int[] arr, int i, int j) {
		while (i < j) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i++;
			j--;
		}
	}

	static void rotetaArray(int[] arr, int k) {
		int n = arr.length;
		k = k % n;
		
		if (k < 0) {
			k += arr.length;
		}
		
		reverseArray(arr, 0, n - k - 1);
		reverseArray(arr, n - k, n - 1);
		reverseArray(arr, 0, n - 1);
	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
		int k = -2;
		rotetaArray(arr, k);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

}
