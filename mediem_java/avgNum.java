package mediem_java;

import java.util.Scanner;

public class avgNum {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int m=0;
		int i=0,j=0,s1=0,s2=0;
		while(m!=-1) {
			m=s.nextInt();
			if(m==-1) {
				break;
			}
			if(m<0) {
				i++;
				s1+=m;
			}
			else {
				j++;
				s2+=m;
			}
		}
		System.out.println("Negitive: "+(float)s1/i);
		System.out.println("Positives :"+(float)s2/j);
	}
}
