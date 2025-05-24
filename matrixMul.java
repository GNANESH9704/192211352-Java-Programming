package java_class;

public class matrixMul {
	    public static void main(String[] args) {
	        int[][] m1 = {
	            {1, 2},
	            {5, 3}
	        };
	        int[][] m2 = {
	            {2, 3},
	            {4, 1}
	        };
	        int[][] m3 = new int[2][2];
	        for(int i=0;i<m1.length;i++) {
	        	for(int j=0;j<m1.length;j++) {
	        		for(int k=0;k<2;k++) {
	        		m3[i][j]+=m1[i][k]*m2[k][j];
	        		}
	        	}
	        }
	        for(int i=0;i<2;i++) {
	        	for(int j=0;j<2;j++) {
	        		System.out.print(m3[i][j]+" ");
	        	}
	        	System.out.println();
	        }
	}

}
