package com.questions;

import java.util.Arrays;

public class ReversesArray {
	
	// approach 1
	static int[] reverse1(int[] arr) { 
		
		int n = arr.length;
		int[] ans = new int[n];
		int j = 0;
		for(int i=n-1; i>=0; i--) {
			ans[j++] = arr[i];
		}
		return ans;	
	}
	
	
	// approach 2
	static int[] reverse2(int[] arr) {
		
		int n = arr.length;
		int[] ans = new int[n];
		int i = n-1;
		int j = 0;
		
		while(i >= 0) {
			ans[j++] = arr[i--];
		}
		return ans;
		
	}
	
	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5};
		int[] res = reverse2(arr);
		System.out.println(Arrays.toString(res));
		
	}

}
