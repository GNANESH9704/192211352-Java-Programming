package mediem_java;

import java.util.Scanner;

public class year {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String y=s.next();
		String a[]=y.split("/");
		String d=a[2];
		int n=Integer.parseInt(d);
		if((n%4==0&&n%100!=0)||n%400==0){
			System.out.println("Leap year");
		}
		else {
			System.out.println("Not Leap year");
		}
	}

}
