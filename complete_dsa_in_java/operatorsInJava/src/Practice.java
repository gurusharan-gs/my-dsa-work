import java.util.Arrays;

public class Practice {

	static void gaurav1(int[] arr) {

		int n = arr.length;
		int count = 0;
		for (int i = 0; i < n; i++) {
			if (arr[i] == 0) {
				count++;
			}
		}
		for (int i = 0; i < n; i++) {
			if (i < count) {
				arr[i] = 0;
			} else {
				arr[i] = 1;
			}
		}

	}

	static void gaurav2(int[] arr) {
		int m = arr.length;
		int n = (int) Math.floor(m / 2);

		int[] ans = new int[n];
		int[] ans1 = new int[n];

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 0) {
				ans[i] = 0;
			} else {

				ans1[i] = 1;
			}

			int a1 = ans.length;
			int a2 = ans1.length;

			int[] newo = new int[a1 + a2];
			System.out.println(Arrays.toString(newo));

		}

	}

	static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	
	static void gaurav3(int[] arr) {
		int n = arr.length;
		int left = 0 , right = n-1;
		
		while( left < right ) {
			if(arr[left]==1 && arr[right]==0) {
				swap(arr, left, right);
				left++;
				right--;
			}
			if(arr[left]==0) {
				left++;
			}
			if(arr[right] == 1) {
				right--;
			}
		}
		
	}

	public static void main(String[] args) {

		int[] arr = { 1, 1, 0, 1, 0, 0, 1, 0, 1, 0 };
		gaurav3(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();

	}

}
