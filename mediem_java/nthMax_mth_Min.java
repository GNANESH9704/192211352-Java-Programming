package mediem_java;

import java.util.Arrays;

public class nthMax_mth_Min {
	public static void main(String[] args) {
		int a[] = {3,2,1,4,5,8};
		int n=1;
		int m=3;
		int temp;
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}
		int max=a[a.length-n];
		int min=a[m-1];
		System.out.println("Max : "+max);
		System.out.println("Min : "+min);
		System.out.println("Sum : "+max+min);
		System.out.println("Difference :"+(max-min));
	}
}
