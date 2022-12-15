package com.questions;

import java.util.Arrays;

// step 1
public class RotateArray {

	static int[] rotateArray(int[] arr, int k) {

		int n = arr.length;
		k = k % n;
		int[] ans = new int[n];
		int j = 0;

		for (int i = n - k; i < n; i++) {
			ans[j++] = arr[i];
		}

		for (int i = 0; i < n - k; i++) {
			ans[j++] = arr[i];
		}
		return ans;

	}
	
// *==========================================================* //	
	
	// step 2
	public static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	
	public static void reverce(int[] arr, int i, int j) {
		while(i < j)
		swap(arr, i, j);
		i++;
		j--;
	}
	
	static void rotateInPlace(int[] arr, int k) {
		int n = arr.length;
		k = k % n;
		reverce(arr, 0, n-k-1);
		reverce(arr, n-k, n-1);
		reverce(arr, 0, n-1);
		
	}

	
	public static void print(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5};
		int k = 4;
		rotateInPlace(arr, k);
		print(arr);
		
	
	}
	

}
