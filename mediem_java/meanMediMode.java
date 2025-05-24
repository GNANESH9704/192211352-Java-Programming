package mediem_java;

import java.util.Arrays;

public class meanMediMode {

	public static void main(String[] args) {
		int[] a= {1,2,3,4,5,6,7,8,8};
		Arrays.sort(a);
		System.out.println("Mean :"+mean(a));
		System.out.println("Median :"+median(a));
		System.out.println("Mode :"+mode(a));
	}
	static int mean(int[] a) {
		int sum=0;
		for(int i=0;i<a.length;i++) {
			sum+=i;
		}
		return sum;
	}
	static double median(int[] a) {
		int n=a.length;
		if(n%2!=0) {
			return a[n/2];
		}
		else {
			return (a[n/2]+a[n/2-1])/2;
		}
	}
	static int mode(int[] a) {
		int c=0;
		int m=0,i,mo = 0;
		for(i=0;i<a.length-1;i++) {
			if(a[i]==a[i+1]) {
				c++;
			}
		}
		if(c>m) {
			m=c;
			mo=a[i];
		}
		return mo;
	}

}
