package com.prefixsum_No_22;

public class Problems2 {

	static int findingArraySum(int[] arr) {

		int totalSum = 0;
		for (int i = 0; i < arr.length; i++) {
			totalSum += arr[i];
		}
		return totalSum;
	}

//	perfSum method-----
	static boolean equalSumPartition1(int[] arr) {

		int totalSum = findingArraySum(arr);

		int perfSum = 0;
		for (int i = 0; i < arr.length; i++) {
			perfSum += arr[i];
			int suffixSum = totalSum - perfSum;
			if (suffixSum == perfSum) {
				return true;
			}
		}
		return false;
	}

	
//	suffixSum method-----
	static boolean equalSumPartition2(int[] arr) {

		int totalSum = findingArraySum(arr);

		int n = arr.length;
		int perfSum = 0;
		for (int i = n - 1; i >= 0; i--) {
			perfSum += arr[i];
			int suffixSum = totalSum - perfSum;
			if (suffixSum == perfSum) {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {

		int[] arr = { 2, 3, 4, 5, 6, 8 };
		boolean res = equalSumPartition2(arr);
		System.out.println(res);
	}
}
