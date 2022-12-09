
public class GraterOccurrenceOfX {
	
	public static int graterOccurrenceOfX(int[] arr, int x) {
		
		int count = 0;
		int res = -1;
		for(int i=0; i<arr.length; i++) {
			if(arr[i] > x) {
				count++;
				res = arr[i];
			}
		}
		return res;
		
	}

	public static void main(String[] args) {
		
		int[] arr = {5,2,3,5,5,7,2,5};
		int x = 5;
		int res = graterOccurrenceOfX(arr, x);
		System.out.println(res);

	}

}
