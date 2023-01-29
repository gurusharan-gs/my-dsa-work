package practice;

public class Problem3 {
	
	public static void main(String[] args) {
		String str = "guru@gmail#$%";
		int count = 0;
		String ans = "";
		for(int i=0; i<str.length(); i++) {
			if(!Character.isDigit(str.charAt(i)) && !Character.isLetter(str.charAt(i)) && !Character.isWhitespace(str.charAt(i))) {
				count++;
			}else {
				ans += str.charAt(i);
			}
		}
		System.out.println(count);
		System.out.println(ans);
	}

}
