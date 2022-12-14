package com.questions;

public class FirstRepeatingNumber {
	
	// finding first repeating number given array method
	public static int firstRepeatingNumber(int[] arr) {
		
		int n = arr.length;
		
		for(int i=0; i<n; i++) {       // first number
			for(int j=i+1; j<n; j++) { // second number
				if(arr[j] == arr[i]) { // found answer
					return arr[j];     // return answer
				}
			}
		}
		return -1;
		
	}
	
	// finding last repeating number given array method
	public static int lastRepeatingNumber(int[] arr) {
		int n = arr.length;
		
		int res = -1;
		for(int i=0; i<n; i++) {
			for(int j=i+1; j<n; j++) {
				if(arr[j] == arr[i]) {
					res = arr[i];
					
				}
			}
		}
		return res;
	}
	
	public static void main(String[] args) {
		
		int[] arr = {2,3,4,3,4,1,5,1};
		int res = lastRepeatingNumber(arr);
//		int res = firstRepeatingNumber(arr);
		System.out.println(res);
		
	}

}
