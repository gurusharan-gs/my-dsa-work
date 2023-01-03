package com.AllQsn;

public class P2 {
	public static void swapArray(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	public static int[] reverceArray(int[] arr) {
		int i = 0, j = arr.length - 1;
		while (i < j) {
			swapArray(arr, i, j);
			i++;
			j--;
		}
		return arr;
	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5}; // 5 4 3 2 1
		int[] res = reverceArray(arr);
		for (int i = 0; i < res.length; i++) {
			System.out.print(res[i] + " ");
		}
		System.out.println();
	}

}
