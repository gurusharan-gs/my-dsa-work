package practices;

public class P1 {
	
	static void bubbleSort(int[] arr) {
		
		int n = arr.length;
		
		for(int i=0; i<n-1; i++) {
			boolean flag = false;
			for(int j=0; j<n-i-1; j++) {
				if(arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
				    arr[j+1] = temp;
				    flag = true;
				}
			}
			if(!flag) return;
		}
	}
	
	static void selectionSort(int[] arr) {
		
		int n = arr.length;
		
		for(int i=0; i<n-1; i++) {
			int min = i;
			
			for(int j=i+1; j<n; j++) {
				if(arr[j] < arr[min]) {
					min = j;
				}
			}
			int temp = arr[i];
			arr[i] = arr[min];
			arr[min] = temp;
		}
	}
	
	static void inserationSort(int[] arr){
		
		int n = arr.length;
		
//	1=	7,8,5,2,3,1,4,6

		
		
		
		// 2 5 7 8 3,1,4,6
		for(int i=1; i<n; i++) {
			int j=i;
			
			while(j>0 && arr[j] < arr[j-1]) {
				int temp = arr[j];
				arr[j] = arr[j-1];
				arr[j-1] = temp;
				j--;
			}
		}
	}
	
	public static void main(String[] args) {
		
		int[] arr = {7,8,5,2,3,1,4,6};
		bubbleSort(arr);
		for(int ans : arr) {
			System.out.print(ans + " ");
		}
		System.out.println();
		
		selectionSort(arr);
		for(int ans : arr) {
			System.out.print(ans + " ");
		}
		System.out.println();
		
		inserationSort(arr);
		for(int ans : arr) {
			System.out.print(ans + " ");
		}
		
	}

}
