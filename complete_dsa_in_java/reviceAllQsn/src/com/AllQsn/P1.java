package com.AllQsn;

public class P1 {
	
	public static int[] reverceArray(int[] arr) {
		int n = arr.length;
		int[] ans = new int[n];
		int fill = 0;
		for(int i=n-1; i >= 0; i--) {
			ans[fill++] = arr[i];
		}
		return ans;
	}
	
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6}; // 6 5 4 3 2 1
		int[] res = reverceArray(arr);
		for(int i=0; i<res.length; i++) {
			System.out.print(res[i]+" ");
		}
		System.out.println();
	}

}
