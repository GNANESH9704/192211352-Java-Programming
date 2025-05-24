package java_class;

import java.util.Scanner;

public class lcmAgcd {
	static int gcd(int a,int b) {
		while(a!=b) {
			if(a>b) {
				a=a-b;
			}
			if(b>a) {
				b=b-a;
			}
		}
		return a;
	}
	
	static int lcm(int a,int b) {
		int lcm;
		return lcm=a*b/gcd(a,b);
	}

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt();
		System.out.println(gcd(a,b));
		System.out.println(lcm(a,b));
	}

}
