package java_class;

public class compositeArray {
	public static void main(String[] args) {
		int[] ar= {12,18,16,16,16,18};
		int n=100;
		int count=0;
		for(int i=0;i<ar.length;i++) {
			int c=0;
			for(int j=1;j<=n;j++) {
				if(ar[i]%j==0) {
					c++;
				}
			}
			if(c>2) {
				count++;
			}
		}
		System.out.println(count);
	}
}