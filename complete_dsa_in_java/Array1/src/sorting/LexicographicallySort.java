package sorting;

public class LexicographicallySort {

	static void sortFruits(String[] fruits) {
		int n = fruits.length;
		
		for(int i=0; i<n-1; i++) {
			
			int min_el = i;
			
			for(int j=i+1; j<n; j++) {
				if(fruits[j].compareTo(fruits[min_el]) < 0) {
					min_el = j;
				}
			}
			String temp = fruits[i];
			fruits[i] = fruits[min_el];
			fruits[min_el] = temp;
		}
		
	}

	public static void main(String[] args) {
		String[] fruits = { "kiwi", "mango", "apple", "papaya" };
		sortFruits(fruits);
		for (String str : fruits) {
			System.out.print(str + " ");
		}
	}

}
