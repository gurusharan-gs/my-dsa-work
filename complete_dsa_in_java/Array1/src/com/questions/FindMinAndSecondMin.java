package com.questions;

public class FindMinAndSecondMin {

	// finding second minimum number in the array method
	public static int findMin(int[] arr) {

		int n = arr.length;

		int min = Integer.MAX_VALUE;
		for (int i = 0; i < n; i++) {
			if (arr[i] < min) {
				min = arr[i];
			}
		}
		return min;
	}

	// finding second minimum number in the array method
	public static int findSecondMin(int[] arr) {

		int n = arr.length;

		int min = findMin(arr);
		for (int i = 0; i < n; i++) {
			if (arr[i] == min) {
				arr[i] = Integer.MAX_VALUE;
			}
		}
		int secondMin = findMin(arr);
		return secondMin;
	}

	public static void main(String[] args) {

		int[] arr = { 1, 12, 8, 4, 1, 15, 3 };

		int res = findSecondMin(arr);
		System.out.println(res);

	}

}
