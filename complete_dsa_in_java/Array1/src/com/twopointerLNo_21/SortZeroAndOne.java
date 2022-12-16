package com.twopointerLNo_21;

import java.util.Arrays;

public class SortZeroAndOne {
	
	
	public static void sortZeroAndOne(int[] arr) {
		
		int n = arr.length;
		int count = 0;
		for(int i=0; i<n; i++) {
			if(arr[i] == 0) {
				count++;
			}
		}
		for(int i=0; i<n; i++) {
			if(i < count) {	
				arr[i] = 0;	
			}else {
				arr[i] = 1;
			}
		}
	}
	
	public static void main(String[] args) {
		
		int[] arr = {1, 0, 1, 0, 0, 1, 0, 1};
		sortZeroAndOne(arr);
		System.out.println(Arrays.toString(arr));
		
	}

}
