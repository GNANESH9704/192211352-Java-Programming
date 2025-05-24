package mediem_java;

public class decimalToBiOc {
	static String binary(int n) {
		String r="";
		while(n!=0) {
			int re=n%2;
			r=r+re;
			n=n/2;
		}
		return r;
	}
	static int octal(String r) {
		int m=0;
		int p=1;
		for(int i=0;i<r.length();i++) {
			if(r.charAt(i)=='1') {
				m+=p;
			}
			p=p*2;
		}
		return m;
	}

	public static void main(String[] args) {
		int n=15;
		String res=binary(n);
		System.out.println(res);
		System.out.println(octal(res));
	}
}
