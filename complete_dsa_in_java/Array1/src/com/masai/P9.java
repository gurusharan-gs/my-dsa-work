package com.masai;

import java.util.Arrays;

public class P9 {
	
	static int d(int[] arr) {
		int res = -1;
		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[j]==arr[i]) {
					return arr[j];
				}
			}
		}
		return res;
		
	}
	
	public static void main(String[] args) {
		
		int[] arr = {1, 1, 5, 4, 2, 3, 4, 5, 7};
		d(arr);
		System.out.println(Arrays.toString(arr));
		
		
	}

}
