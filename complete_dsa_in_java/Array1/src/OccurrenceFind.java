
public class OccurrenceFind {
	
	public static int occurrenceFind(int[] arr, int x) {
		
		int count = 0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i] == x) {
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		
		int[] arr = {5,2,3,5,5,7,2,5};
		int x = 5;
		System.out.println(occurrenceFind(arr, x));
		

	}

}
