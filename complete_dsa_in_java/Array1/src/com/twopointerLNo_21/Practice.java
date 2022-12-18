package com.twopointerLNo_21;

import java.util.Iterator;

public class Practice {

	static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	static void zeroAndOne(int[] arr) {
		
		int n = arr.length;
		
		int left = 0, right = n-1;
		
		while(left < right) {
			if(arr[left]==1 && arr[right]==0) {
				swap(arr, left, right);
				left++;
				right--;
			}
			if(arr[left]==0) {
				left++;
			}
			if(arr[right]==1) {
				right--;
			}
		}
		
	}
	
	public static void main(String[] args) {
		int[] arr = {1,1,0,1,0,0,1,0,0};
		zeroAndOne(arr);
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
}
