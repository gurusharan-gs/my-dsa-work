package sorting;

public class MoveZeros {

	// move zeros end points
	public static void main(String[] args) {

		int[] arr = { 4, 5, 0, 4, 0, 8, 0 };

		int n = arr.length;
		
		for (int i = 0; i < n - 1; i++) {
			for (int j = i + 1; j < n - i - 1; j++) {
				if (arr[j] == 0 && arr[j + 1] != 0) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		for (int i : arr) {
			System.out.print(i + " ");
		}
	}
}
