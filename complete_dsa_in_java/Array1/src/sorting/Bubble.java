package sorting;

import java.util.Arrays;

public class Bubble {

	static void bubble(int[] arr) {
		
		boolean flag;
		
		for(int i = 0; i < arr.length; i++) {
			flag = false;
			for(int j = 1; j < arr.length - i; j++) {
				if (arr[j] < arr[j - 1]) {
					int temp = arr[j];
					arr[j] = arr[j - 1];
					arr[j - 1] = temp;
					flag = true;
				}
			}
			if(!flag) {
				break;
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 5, 4, 2, 3, 1 };
		bubble(arr);
		System.out.println(Arrays.toString(arr));
		
//		time complexity O(n2)
//		spce complexity O(1)

	}

}
