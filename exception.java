package java_class;

public class exception {

	public static void main(String[] args) {
		int n=10;
		try {
			n=n/0;
		}
		catch(ArithmeticException e) {
			System.out.println("It is index out of bound "+n);
		}
		finally {
			System.out.println("it will print always");
		}
	}

}
