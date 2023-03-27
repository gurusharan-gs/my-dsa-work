package arr;

public class Palindrome {

	public static void main(String[] args) {

		String str = "gurusharan";
		int n = str.length();
		String res = "";

		for (int i = n - 1; i >= 0; i--) {
			res += str.charAt(i);
		}
		if (res.equals(str)) {
			System.out.println("palindrome!");
		} else {
			System.out.println("not palindrome!!");
		}

	}

}
