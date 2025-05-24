package java_class;

import java.util.Scanner;

public class reverse {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		String n = s.next();
		String r="";
		for(int i=n.length()-1;i>=0;i--) {
			r=r+n.charAt(i);
		}
		System.out.println(r);
	}

}
