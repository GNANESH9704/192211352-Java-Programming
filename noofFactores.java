package java_class;

import java.util.Scanner;

public class noofFactores {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Given number: ");
	        int number = scanner.nextInt();
	        int count = 0;
	        for (int i = 1; i <= number; i++) {
	            if (number % i == 0) {
	                count++;
	            }
	        }
	        System.out.println("Number of factors = " + count);
	        scanner.close();
	    }

}
