package pattern;

public class Demo {
	
	public static void main(String[] args) {
		
		X x = new XImpl();
		x.fun1();
		x.fun2();
		
		XImpl xx = (XImpl)x;
		xx.fun3();
		
		
	}

}
