package com.arrayquestions;

public class Problem_2 {
	
//	  leetcode question-
//	  1. Two Sum
	
	  public static int[] twoSum(int[] arr, int target) {
		  
		  for(int i=0; i<arr.length; i++) {
			  for(int j=i+1; j<arr.length; j++) {
				  if(arr[i] + arr[j] == target) {
					return new int[] {i, j};
				  }
			  }
		  }
		  return new int[] {-1, -1}; 
  
	  }
	  
	  public static void main(String[] args) {
		
		 int[] nums = {2,7,11,15}; 
		 int target = 9;
		 int[] res = twoSum(nums, target);
		 
		 for(int s : res) {
			System.out.print(s); 
		 }
		 System.out.println();
	  
	}

}
