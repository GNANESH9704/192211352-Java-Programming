package mediem_java;

import java.util.Scanner;

public class countLUD {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		char c='0';
		int l=0,u=0,d=0;
		while(c!='*') {
			c=s.next().charAt(0);
			if(c>=65 && c<=90) {
				u++;
			}
			else if(c>=97 && c<=122) {
				l++;
			}
			else if(c>=45 && c<=57) {
				d++;
			}
		}
		System.out.println("Upper :"+u);
		System.out.println("Lower :"+l);
		System.out.println("Digit :"+d);
	}

}
