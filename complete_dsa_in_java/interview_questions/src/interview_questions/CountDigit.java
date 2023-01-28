package interview_questions;

public class CountDigit {
	
	public static void main(String[] args) {
		
//		Approach 1
//		int digit = 12345;
//		String str = Integer.toString(digit);
//		System.out.println(str.length());
		
		
//		Approach 2
		int digit = 123456;
		int count = 0;
		while(digit > 0) {
			count++;
			digit = digit / 10;
		}
		System.out.println(count);
	}
}
