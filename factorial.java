package java_class;

import java.util.Scanner;

public class factorial {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		 int n=s.nextInt();
		 int fact=1;
		 for(int i=1;i<=n;i++)
		 {
		 fact=fact*i;
		 }
		 System.out.print(fact);
		}

}
