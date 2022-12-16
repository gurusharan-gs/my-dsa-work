package com.twopointerLNo_21;

public class SortSquares {

	public static void swapInPlace(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	public static void reverceArray(int[] arr) {

		int n = arr.length;
		int left = 0, right = n - 1;

		while (left < right) {
			swapInPlace(arr, left, right);
			left++;
			right--;
		}

	}

	// approach 1 with reverceArray
	static int[] sortSquares1(int[] arr) {

		int n = arr.length;
		int[] ans = new int[n];
		int k = 0;

		int left = 0, right = n - 1;

		while (left <= right) {
			if (Math.abs(arr[left]) > Math.abs(arr[right])) {
				ans[k++] = arr[left] * arr[left];
				left++;

			} else {
				ans[k++] = arr[right] * arr[right];
				right--;

			}
		}

		return ans;
	}

	static int[] sortSquares2(int[] arr) {

		int n = arr.length;
		int[] ans = new int[n];
		int k = n - 1;

		int left = 0, right = n - 1;

		while (left <= right) {
			if (Math.abs(arr[left]) > Math.abs(arr[right])) {
				ans[k--] = arr[left] * arr[left];
				left++;

			} else {
				ans[k--] = arr[right] * arr[right];
				right--;

			}
		}

		return ans;
	}

	public static void main(String[] args) {
		int[] arr = { -10, -8, -4, 1, 3, 5, 7 };
		int[] res = sortSquares2(arr);
//		reverceArray(res);

		for (int i = 0; i < res.length; i++) {
			System.out.print(res[i] + " ");
		}
		System.out.println();
	}

}
