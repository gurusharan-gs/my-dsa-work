package com.prefixsum_No_22;

import java.util.Arrays;

public class PrefixSum {

	// problem 1
	static int[] prefixSum1(int[] arr) {

		int n = arr.length;
		int[] pref = new int[n];
		pref[0] = arr[0];

		for (int i = 1; i < n; i++) {
			pref[i] = pref[i - 1] + arr[i];
		}
		return pref;
	}

	// problem 2
	static int[] prefixSum2(int[] arr) {

		int n = arr.length;
		for (int i = 1; i < n; i++) {
			arr[i] = arr[i - 1] + arr[i];
		}
		return arr;

	}

	public static void main(String[] args) {

		int[] arr = { 2, 1, 3, 4, 5 };
		int[] ans = prefixSum2(arr);
		System.out.println(Arrays.toString(ans));

	}

}
