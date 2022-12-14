
public class LastOccurrenceOfX {
	
	public static int lastOccurrenceOfX(int[] arr, int x) {
		
		int lastIndex = -1;
		for(int i=0; i<arr.length; i++) {
			if(arr[i] == x) {
				lastIndex = i;
			}
		}
		return lastIndex;
		
	}

	public static void main(String[] args) {
		
		int[] arr = {5,2,3,5,5,7,2,5};
		int target = 5;
		int res = findlastOccur(arr, target);
		System.out.println(res);

	}
	
	
	static int findlastOccur(int[] arr, int target) {
		
		int res = -1;
		for(int i=0; i<arr.length; i++) {
			if(arr[i] == target) {
				res = i;
			
			}
		}
		return res;
		
	}



}
