package arr;

public class A {

	public static void main(String[] args) {

		int[] arr = { 4, 2, 1, 10, 6 };
		int product = 1;
		for (int i = 0; i < arr.length; i++) {
			product *= arr[i];
		}
//		System.out.println(pSum);

		int x = 1;
		while ((x * x * x * x * x) < product) {
			x++;
		}
		System.out.println(x);
	}

}
