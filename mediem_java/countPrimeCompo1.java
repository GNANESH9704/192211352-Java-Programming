package mediem_java;

public class countPrimeCompo1 {

	public static void main(String[] args) {
		int cn=0;
		int pn=0;
		int[] e= {23,4,5,4,2,1};
		for(int i=0;i<e.length;i++) {
			int c=0;
			for(int j=1;j<100;j++) {
				if(e[i]%j==0){
					c++;
				}
			}
			if(c>2) {
				cn++;
			}
			else {
				pn++;
			}
		}
		System.out.println("Composite :"+cn);
		System.out.println("Prime :"+pn);
	}
}
