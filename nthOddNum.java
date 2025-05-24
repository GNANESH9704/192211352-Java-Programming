package java_class;

import java.util.Arrays;

public class nthOddNum {

	public static void main(String[] args) {
		int n=4;
		int j=1;
		int[] a=new int[n*n];
		for(int i=1;i<n*n;i++) {
			if(i%2!=0) {
				a[j]=i;
				j++;
			}
		}
		System.out.println(a[n*2]);
	}

}
