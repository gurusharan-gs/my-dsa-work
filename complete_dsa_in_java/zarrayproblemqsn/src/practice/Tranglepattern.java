package practice;

public class Tranglepattern {

	public static void main(String[] args) {

		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}

		System.out.println("====================");

		for (int i = 4; i >= 0; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}

		System.out.println("====================");

		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= 4; j++) {
				if(i==1 || i==4 || j==1 || j==4) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}

}
