package java_class;

import java.util.Scanner;

public class eligibleVote {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.print("enter the age: ");
		int n=s.nextInt();
		if(n<18) {
			System.out.println("you are not eligible to vote,you are eligible after,"+ (18-n));
		}
		else {
			System.out.println("you are eligible to vote");
		}
	}

}
