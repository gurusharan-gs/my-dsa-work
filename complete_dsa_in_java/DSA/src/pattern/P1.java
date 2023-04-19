package pattern;

public class P1 {

//	pattern 1
	public static void pattern1(int n) {

		for (int row = 1; row <= n; row++) {
			for (int col = 1; col <= n; col++) {
				System.out.print("* ");
			}
			System.out.println();
		}

	}

//	pattern 2
	public static void pattern2(int n) {

//		this is outside loop 
		for (int row = 1; row <= n; row++) {
			for (int col = 1; col <= row; col++) {
//				this is printing star
				System.out.print("* ");
			}
//			this is a the print the next line
			System.out.println();
		}

	}
	
//	pattern 3
	public static void pattern3(int n) {

		for (int row = 1; row <= n; row++) {
			for (int col = row; col <= n; col++) {
				System.out.print("* ");
			}
			System.out.println();
		}

	}
	
//	pattern 3
	public static void pattern4(int n) {

		for (int row = 1; row <= n; row++) {
			for (int col = 1; col <= n-row+1; col++) {
				System.out.print("* ");
			}
			System.out.println();
		}

	}
	
	

	public static void main(String[] args) {

		pattern2(4);
		pattern1(4);
		pattern3(4);
		System.out.println("-------------------------------");
		pattern4(4);

	}

}
