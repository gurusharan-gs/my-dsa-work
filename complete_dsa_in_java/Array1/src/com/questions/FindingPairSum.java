package com.questions;

public class FindingPairSum {
	
	public static int findingPairSum(int[] arr, int target) {
		
		int n = arr.length;
		int count = 0;
		
		for(int i=0; i<n; i++) {
			for(int j=i+1; j<n; j++) {
				if(arr[i] + arr[j] == target) {
					count++;
				}
			}
		}
		return count;
		
	}
	
	public static void main(String[] args) {
		
		int[] arr = {4, 2, 5, 2, 1, 6, 8, 7};
		int target = 12;
		int x = findingPairSum(arr, target);
		System.out.println(x);
		
	}

}
