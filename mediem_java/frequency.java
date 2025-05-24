package mediem_java;

public class frequency {

	public static void main(String[] args) {
		int[] a= {1,2,5,6,7,3,2,2,5,7};
		System.out.println("Element"+"|"+"Frequency");
		for(int i=0;i<a.length;i++) {
			boolean already=false;
			for(int j=0;j<i;j++) {
				if(a[i]==a[j]) {
					already=true;
					break;
				}
			}
			if(already) {
				continue;
			}
			int c=0;
			for(int k=0;k<a.length;k++) {
				if(a[k]==a[i]) {
					c++;
				}
			}
			System.out.println( a[i] + "      |      "+c);
		}
	}

}
