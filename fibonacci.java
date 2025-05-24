package java_class;

import java.util.Scanner;
public class fibonacci{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int temp,a=0,b=1,sum=0;
		for(int i=0;i<=n*2;i++) {
			System.out.println(a);
			temp=a;
			a=a+b;
			b=temp;
		}
		if(a%2==0) {
			sum+=a;
		}
		System.out.println(sum);
	}

}
