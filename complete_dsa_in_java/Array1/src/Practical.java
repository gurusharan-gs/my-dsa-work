import java.util.Arrays;

public class Practical {

	static int findMaxNumber(int[] arr) {
		int n = arr.length;
		int max = Integer.MIN_VALUE;
		for(int i=0; i<n; i++) {
			if(arr[i] > max) {
				max = arr[i];
			}
		}
		return max;
	}
	
	static int findSecondNumber(int[] arr) {
		int max = findMaxNumber(arr);
		int n = arr.length;
		for(int i=0; i<n; i++) {
			if(arr[i] == max) {
				arr[i] = Integer.MIN_VALUE;
			}
			
		}
		return findMaxNumber(arr);
	}
	
	/**********************************************************************/
	
	
	public static int repetedNumber(int[] arr) {
		int n = arr.length;
		
		for(int i=0; i<n; i++) {
			for(int j=i+1; j<n; j++) {
				if(arr[j] == arr[i]) {
					return arr[j];
				}
			}
		}
		return -1;
	}

	
	
	public static int repetedNumber1(int[] arr) {
		
		int n = arr.length;
		for(int i=0; i<n; i++) {
			for(int j=i+1; j<n; j++) {
				if(arr[j] == arr[i]) {
					return arr[j];
				}
			}
		}
		return -1;
	}
	
	
	/***************************************************************************/
	
	static void rotateArray(int[] arr, int k) {
		
		int n = arr.length;
		
		reverce(arr, 0, n-k-1);
		reverce(arr, n-k, n-1);
		reverce(arr, 0, n-1);

	}
	
	static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;;
	}
	
	 static void reverce(int[] arr, int i, int j) {
		while(i < j)
		swap(arr, i, j);
		i++;
		j--;
	}
	

	public static void main(String[] args) {

		int[] arr = { 2, 3, 12, 15, 19, 22, 25, 30, 22 };
		int t = 2;
		rotateArray(arr, t);
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]);
		}
		System.out.println();

	}

}
