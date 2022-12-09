package com.arrayquestions;

public class Problem_1 {
	
//	leetcode questions--
//	26. Remove Duplicates from Sorted Array
	
	 public static int removeDuplicates(int[] arr) {
		 
		 int j = 0;
		 for(int i=0; i<arr.length; i++) {
			 if(arr[i] != arr[j]) {
				 arr[++j] = arr[i];
			 }
		 }
		 
//	     return j+1; 
	     return ++j; 
	 }
	
	public static void main(String[] args) {
		
		int[] arr = {0,0,1,1,1,2,2,3,3,4};
		
		int res = removeDuplicates(arr);
		System.out.println(res);
			
	}

	

}
