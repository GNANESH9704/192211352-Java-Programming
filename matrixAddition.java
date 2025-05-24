package java_class;

public class matrixAddition {

	public static void main(String[] args) {
		int m1[][]= {{1,2},{3,4}};
		int m2[][]= {{2,4},{5,6}};
		int[][] m3 = new int[2][2];
		for(int i=0;i<m1.length;i++){
			for(int j=0;j<m1.length;j++) {
				m3[i][j] = m1[i][j]+m2[i][j];
			}
		}
		for(int i=0;i<m3.length;i++) {
			for(int j=0;j<m3.length;j++) {
				System.out.print(m3[i][j] +" ");
			}
			System.out.println();

		}
	}

}
