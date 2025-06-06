package java_class;

import java.util.Arrays;

public class mergeTwo {
	    public static int[] merge(int[] arr1, int[] arr2) {
	        int i = 0, j = 0, k = 0;
	        int[] merged = new int[arr1.length + arr2.length];
	        while (i < arr1.length && j < arr2.length) {
	            if (arr1[i] < arr2[j]) {
	                merged[k++] = arr1[i++];
	            } else {
	                merged[k++] = arr2[j++];
	            }
	        }
	        while (i < arr1.length) {
	            merged[k++] = arr1[i++];
	        }
	        while (j < arr2.length) {
	            merged[k++] = arr2[j++];
	        }
	        return merged;
	    }
	    public static void main(String[] args) {
	        int[] arr1 = {1, 3, 5};
	        int[] arr2 = {2, 4, 6};
	        int[] result = merge(arr1, arr2);
	        System.out.println(Arrays.toString(result));
	    }
}
