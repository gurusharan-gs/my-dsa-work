package practice;

public class Problem2 {
	
	public static void main(String[] args) {
		
		int digits = 123456;
		String str = Integer.toString(digits);
		System.out.println(str.length());
		
		int count = 0;
		while(digits > 0) {
			count++;
			digits = digits / 10;
		}
		System.out.println(count);
	}

}
