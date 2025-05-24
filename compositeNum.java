package java_class;

import java.util.Scanner;

public class compositeNum {
	static boolean compo(int n) {
		if(n<4) {
			return false;
		}
		for(int i=2;i<=n/2;i++) {
			if(n%i==0) {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int b= s.nextInt();
		for(int i=a;i<=b;i++) {
			if(compo(i)) {
				System.out.print(i+" ");
			}
		}
		s.close();
	}
}
