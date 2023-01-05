package com.AllQsn;

public class P6 {
	public static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	public static int[] sortZeroAndOne(int[] arr) {
		int i = 0;
		int j = arr.length-1;
		while(i < j) {
			if(arr[i]==1 && arr[j]==0) {
				swap(arr, i, j);
				i++;
				j--;
			}
			if(arr[i]==0) {
				i++;
			}
			if(arr[j]==1) {
				j--;
			}
		}
		return arr;
	}
	
	public static void main(String[] args) {
		int[] arr = {1,0,1,0,0,1,1,0,1,0};
		int[] res = sortZeroAndOne(arr);
		for(int i=0; i<arr.length; i++) {
			System.out.print(res[i]+" ");
		}
		System.out.println();
		
	}

}
