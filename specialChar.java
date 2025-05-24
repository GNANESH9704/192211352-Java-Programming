package java_class;

import java.util.Scanner;

public class specialChar {
	    public static void main(String[] args) {
	        Scanner s= new Scanner(System.in);
	        System.out.println("enter a string :");
	        String n = s.next();
	        int co=0;
	        for(char c :n.toCharArray()) {
	        	if(!Character.isLetterOrDigit(c) && !Character.isWhitespace(c)) {
	        		System.out.print(c+" ");
	        		co++;
	        	}
	        }
	        System.out.println();
	        System.out.println(co);
	       s.close();
	}

}
