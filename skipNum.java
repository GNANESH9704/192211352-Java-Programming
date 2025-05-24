package java_class;

import java.util.Scanner;

public class skipNum {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int b = s.nextInt();
		int sk = s.nextInt();
		for(int i=a;i<=b;i+=sk+1) {
			System.out.println(i);
		}
	}

}
