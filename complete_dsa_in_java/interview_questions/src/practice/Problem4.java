package practice;

public class Problem4 {
	
	static boolean rotateString(String str1, String str2) {
		
		String ans = str1+str1;
		if(str1.length() != str2.length()) {
			return false;
		}
		return ans.contains(str2);
	}
	
	public static void main(String[] args) {
		
//		abcdabcd
		
		String str1 = "abcd";
		String str2 = "cdab";
		boolean res = rotateString(str1, str2);
		System.out.println(res);

		
		
	}

}
