package java_class;

import java.util.Arrays;
import java.util.Scanner;

public class sortOrder {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String[] n = {"ramesh","suresh","naresh","rahul"};
		System.out.println("Enter a character :");
		char a= s.next().charAt(0);
		if(a=='A'||a=='a') {
			Arrays.sort(n);
		}
		else if(a=='D'||a=='d'){
			Arrays.sort(n,(b,c)->b.compareTo(c));
		}
		else {
			System.out.println("Invalid Enter Valid Char ");
			s.close();
			return;
		}
		for(String name:n) {
			System.out.println(name);
		}
		s.close();
	}
}
