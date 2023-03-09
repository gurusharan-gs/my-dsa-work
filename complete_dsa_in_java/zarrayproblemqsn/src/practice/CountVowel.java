package practice;

public class CountVowel {

//	Approach 1
	public static void remVowel1(String str1) {

		for (int i = 0; i < str1.length(); i++) {

			if (str1.charAt(i) == 'a' || str1.charAt(i) == 'e' || str1.charAt(i) == 'i' || str1.charAt(i) == 'o'
					|| str1.charAt(i) == 'u' || str1.charAt(i) == 'A' || str1.charAt(i) == 'E' || str1.charAt(i) == 'I'
					|| str1.charAt(i) == 'O' || str1.charAt(i) == 'U'

			) {
				continue;
			} else {
				System.out.print(str1.charAt(i));
			}
		}
	}

//	Approach 2
	public static String remVowel2(String str2) {
		return str2.replaceAll("[aeiouAEIOU]", "");
	}

	public static void main(String[] args) {

		String str1 = "gurusharan";
		remVowel1(str1);

		System.out.println();

		/***************************************************/

		String str2 = "i am gurusharan";
		System.out.println(remVowel2(str2));

	}
}
