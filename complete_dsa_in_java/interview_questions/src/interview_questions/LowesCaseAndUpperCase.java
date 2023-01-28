package interview_questions;

public class LowesCaseAndUpperCase {

	public static void main(String[] args) {

		String str = "gurusharan and gaurav gurusharan and gaurav";
		
		int mid = str.length() / 2;
		String lowerCase = "";
		String upperCase = "";
		for (int i = 0; i < str.length(); i++) {
			if (i < mid) {
				lowerCase += Character.toLowerCase(str.charAt(i));
			} else {
				upperCase += Character.toUpperCase(str.charAt(i));
			}
		}
		System.out.println(lowerCase + upperCase);
	}
}
