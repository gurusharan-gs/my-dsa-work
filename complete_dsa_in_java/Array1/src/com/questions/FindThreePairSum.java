package com.questions;

public class FindThreePairSum {
	
	public static int findThreePairSum(int[] arr, int target) {
		
		int n = arr.length;
		
		int count = 0;
		for(int i=0; i<n; i++) {
			for(int j=i+1; j<n; j++) {
				for(int k=j+1; k<n; k++) {
					if(arr[i] + arr[j] + arr[k] == target) {
						count++;
					}
				}
			}
		}
		return count;
		
	}
	
     public static void main(String[] args) {
		
		int[] arr = {4, 2, 5, 2, 1, 6, 8, 7};
		int target = 12;
		int x = findThreePairSum(arr, target);
		System.out.println(x);
		
	}

}
