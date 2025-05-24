package mediem_java;

import java.util.Scanner;

public class bonus {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the grade: ");
		char c=s.next().charAt(0);
		System.out.println("Enter the salary: ");
		int n=s.nextInt();
		if(c=='A') {
			if(n<10000) {
				n+=n/2;
			}
			System.out.println("Salary: "+n);
			System.out.println("Bonus: "+(n/5));
			System.out.println("Total :"+(n+(n/5)));
		}
		else if(c=='B') {
			if(n<=10000) {
				n+=n/2;
			}
			System.out.println("Salary: "+n);
			System.out.println("Bonus: "+(n/10));
			System.out.println("Total :"+(n+(n/10)));
		}
	}
}
