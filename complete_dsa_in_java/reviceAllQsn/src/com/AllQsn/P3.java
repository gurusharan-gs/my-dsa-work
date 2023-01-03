package com.AllQsn;

import java.util.Arrays;

public class P3 {
	
	static void rotetaArray(int[] arr, int k) {
		
		int n = arr.length;
		int[] ans = new int[n];
		int af = 0;
		k = k % n;
//		System.out.println(k);
		for(int i = n-k; i< n; i++) { // 5,6,7
			ans[af++] = arr[i];
		}
//		System.out.println(Arrays.toString(ans));
		for(int i=0; i<n-k; i++) { // 1,2,3,4
			ans[af++] = arr[i];
		}
		System.out.println(Arrays.toString(ans));
	}
	
	public static void main(String[] args) {
		int[] arr = { 1,2,3,4,5,6,7}; 
		int k = 3;
		rotetaArray(arr, k);
//		int[] res = rotetaArray(arr, k);
//		for (int i = 0; i < res.length; i++) {
//			System.out.print(res[i] + " ");
//		}
//		System.out.println();
	}

}
