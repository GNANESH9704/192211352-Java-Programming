package java_class;

import java.util.Scanner;

public class noofVowels {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter statement: ");
	        String statement = scanner.nextLine();
	        int count=0;
	        for (char ch : statement.toCharArray()) {
	            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'||
	            		ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') { 
	            	count++;
	            }
	        }
	        System.out.println("vowels = " + count);
	        scanner.close();
	}

}
