package com.binary;

public class BinaryS {

	static int binarySearch(int[] arr, int target) {

		int start = 0, end = arr.length - 1;

		while (start <= end) {
			int mid = start + (end - start) / 2;

			if (target > arr[mid]) {
				start = mid + 1;
			} else if (target < arr[mid]) {
				end = mid - 1;
			} else {
				return mid;
			}
		}

		return -1;
	}

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 14, 15, 20, 25, 30 };
		int target = 20;
		int res = binarySearch(arr, target);
		System.out.println(res);

	}

}
