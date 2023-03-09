package practice;

public class Palindrome {

	public static void main(String[] args) {

		String str = "kayak";
		String ans = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			ans += str.charAt(i);
		}
		if (str.equals(ans)) {
			System.out.println("yes");
		} else {
			System.out.println("no");
		}

	}

}
