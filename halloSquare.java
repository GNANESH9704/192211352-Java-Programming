package java_class;

import java.util.Scanner;

public class halloSquare {

	public static void main(String[] args) {
		int n=5;
		Scanner s=new Scanner(System.in);
		char m=s.next().charAt(0);
		for(int i=1;i<=n ;i++) {
			for(int j=1;j<=n;j++) {
				if(i==1||i==n||j==1||j==n) {
					System.out.print(m+"");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
