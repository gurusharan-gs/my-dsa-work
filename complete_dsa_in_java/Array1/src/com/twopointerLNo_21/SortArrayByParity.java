package com.twopointerLNo_21;

public class SortArrayByParity {

	static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	static void sortArrayByParity(int[] arr) {

		int n = arr.length;

		int left = 0, right = n - 1;

		while (left < right) {
			if (arr[left] % 2 == 1 && arr[right] % 2 == 0) {
				swap(arr, left, right);
				left++;
				right--;
			}

			if (arr[left] % 2 == 0) {
				left++;
			}
			if (arr[right] % 2 == 1) {
				right--;
			}

		}

	}

	public static void main(String[] args) {
		int[] arr = { 2, 3, 5, 6, 7, 8, 9, 4 };
		sortArrayByParity(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
}
