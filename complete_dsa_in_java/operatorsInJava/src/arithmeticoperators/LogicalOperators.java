package arithmeticoperators;

public class LogicalOperators {
	
	public static void main(String[] args) {
		
		// >
		// <
		// <=
		// >=
		// !=
		
		// &&
		// ||
		
	
		int a = 10, b = 15, c = 5;
		
		System.out.println(a > b); // false
		System.out.println(a < c); // false
		System.out.println(c >= b);// false
		System.out.println(b <= b);// true
		System.out.println(a == c);// false
		System.out.println(c != c);// false
		System.out.println(b >= c);// true
		System.out.println(a < c);// false
		System.out.println(c > c);// false
		System.out.println(b <= c);// false
		System.out.println(c >= a);// false
		System.out.println(b != a);// true
		System.out.println(a = c); // error
		System.out.println(a == b);// false
		
		
		
		
	}

}
