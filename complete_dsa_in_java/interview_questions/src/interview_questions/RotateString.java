package interview_questions;

public class RotateString {

	static Boolean rotateString(String str1, String str2) {

		String res = str1 + str1; // ABCDABCD
		if (str1.length() != str2.length()) {
			return false;
		}
		return res.contains(str2);
	}

	public static void main(String[] args) {
		String str1 = "ABCD";
		String str2 = "CDAB";
		boolean ans = rotateString(str1, str2);
		System.out.println(ans);
	}
}
