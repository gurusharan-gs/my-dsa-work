package com.AllQsn;

public class P5 {

	static int[] makeFrequencyArray(int[] arr) {
		int[] freq = new int[100005];
		for (int i = 0; i < arr.length; i++) {
			freq[arr[i]]++;
		}
		return freq;
	}

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
		int[] ans = makeFrequencyArray(arr);
		int q = 1;
		while (q > 0) {
			int x = 7;
			if (ans[x] > 0) {
				System.out.println("Yes");
			} else {
				System.out.println("NO");
			}
			q--;
		}

	}

}
