package java_class;

import java.util.Scanner;

public class invertPyra {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		for(int i=n;i>=0;i--) {
			for(int j=0;j<=n-i;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=2*i-1;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		s.close();
	}


}

