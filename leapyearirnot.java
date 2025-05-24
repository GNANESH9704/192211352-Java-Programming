package java_class;

import java.util.Scanner;

public class leapyearirnot {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);	        
	        System.out.print("Enter Date (dd/mm/yyyy): ");
	        String date = scanner.nextLine();
	        int year = Integer.parseInt(date.split("/")[2]);
	        if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
	            System.out.println("Given year is Leap Year");
	        } else {
	            System.out.println("Given year is Non Leap Year");
	        }
	        scanner.close();
	    }

}
