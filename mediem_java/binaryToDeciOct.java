package mediem_java;

public class binaryToDeciOct {

	public static void main(String[] args) {
		int n=15;
		String o=Integer.toOctalString(n);
		System.out.println(o);
		String b="";
		while(n!=0) {
			int r=n%2;
			b+=r;
			n=n/2;
		}
		System.out.println(b);
	}
}
