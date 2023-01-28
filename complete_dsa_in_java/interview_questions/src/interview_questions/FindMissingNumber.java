package interview_questions;

public class FindMissingNumber {
	
	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,6,7,8,9,10};
		
		int sum = (10 * 11) / 2;
		int actualSum = 0;

		for(int i=0; i<arr.length; i++) {
			actualSum = actualSum + arr[i];
		}
		int ans = sum - actualSum;
		System.out.println(ans);
		
	}

}
