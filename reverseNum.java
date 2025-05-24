package java_class;

import java.util.Scanner;

public class reverseNum {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int r=0;
		while(n!=0) {
			int rev=n%10;
			r=r*10+rev;
			n=n/10;
		}
		System.out.println(r);
	}

}
