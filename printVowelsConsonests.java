package java_class;

import java.util.Scanner;

public class printVowelsConsonests {
		    public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);
		        System.out.print("Enter statement: ");
		        String statement = scanner.nextLine();
		        String v= "";
		        String u= "";
		        for (char ch : statement.toLowerCase().toCharArray()) {
		            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'||
		            		ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
		                v=v+ch;
		            }
		            else {
		            	u=u+ch;
		            }
		        }
		        System.out.println("vowels = " + v);
		        System.out.println("Consonents = "+u);
		        scanner.close();
	}

}
