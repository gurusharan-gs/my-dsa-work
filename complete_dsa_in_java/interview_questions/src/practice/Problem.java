package practice;

public class Problem {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 5, 7, 8, 9, 10 };
		int sum = (10 * 11) / 2;
		int ans = 0;
		for (int i = 0; i < arr.length; i++) {
			ans = ans + arr[i];
		}
		System.out.println(sum - ans);

	}
}
