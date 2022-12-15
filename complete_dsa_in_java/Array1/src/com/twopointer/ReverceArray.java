package com.twopointer;

import java.util.Arrays;


public class ReverceArray {
	
	public static void swapInPlace(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	
	public static void reverceArray(int[] arr) {
		
		int n = arr.length;
	    int left = 0, right = n-1;
	    
	    while(left < right) {
	    	swapInPlace(arr, left, right);
	    	left++;
	    	right--;
	    }
	     
	}
	
	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5,6,7};
		reverceArray(arr);
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();

	}

}
