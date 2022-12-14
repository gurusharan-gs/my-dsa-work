package com.questions;

public class FindMaxAndSecondMax {

	// finding the first maximum in the given arr method
	public static int findMax(int[] arr) {

		int max = Integer.MIN_VALUE;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		return max;

	}

	// finding second maximum number in the arr method
	public static int findSecondMax(int[] arr) {

		int mx = findMax(arr);

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == mx) {
				arr[i] = Integer.MIN_VALUE;
			}
		}

		int secondMax = findMax(arr);
		return secondMax;

	}


	public static void main(String[] args) {

		int[] arr = { 1, 12, 8, 4, 1, 15, 3 };

		int x = findSecondMax(arr);
		System.out.println(x);

	}

}
