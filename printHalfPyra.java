package java_class;

public class printHalfPyra {

	public static void main(String[] args) {
		int a=1;
		int b=3;
		for(int i=0;i<b;i++) {
			for(int j=0;j<i;j++) {
				System.out.print(a);
			}
			System.out.println();
		}
		for(int i=b;i>0;i--) {
			for(int j=0;j<i;j++) {
				System.out.print(a);
			}
			System.out.println();
		}
	}
}
