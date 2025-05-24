package java_class;

import java.util.Scanner;

public class rectangleSyambol {

	public static void main(String[] args) {
		int a=5;
		int b=10;
		Scanner s= new Scanner(System.in);
		char sy=s.next().charAt(0);
		for(int i=0;i<=a;i++) {
			for(int j=0;j<=b;j++) {
				System.out.print(sy+" ");
			}
			System.out.println();
		}
	}
}
