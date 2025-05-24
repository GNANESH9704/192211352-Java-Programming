package java_class;

import java.util.Scanner;

public class simpleIntre {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int p = s.nextInt();
		int y = s.nextInt();
		int a = s.nextInt();
		double in = 0.00;
		if(a>=60) {
			in = (p*y*0.12/100);
			System.out.println(in);
		}
		else {
			in = (p*y*0.1/100);
			System.out.println(in);
		}
	}

}
