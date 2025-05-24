package java_class;

public class armStrong {
	static int arms(int n) {
		int c,r=0;
		while(n!=0) {
			int rev=n%10;
			c=rev*rev*rev;
			r=r+c;
			n=n/10;
		}
		return r;
	}

	public static void main(String[] args) {
		int n=153;
		int re=arms(n);
		if(n==re) {
			System.out.println("Armstrong");
		}
		else {
			System.out.println("Not armstrong");
		}
	}

}
