package mediem_java;

import java.util.Arrays;

public class anagram {
	public static void main(String[] args) {
		String a="listen";
		String b="silent";
		char[] c=a.toCharArray();
		char[] d=b.toCharArray();
		Arrays.sort(c);
		Arrays.sort(d);
		if(Arrays.equals(c, d)) {
			System.out.println("Anagram");
		}
		else {
			System.out.println("Not Anagram");
		}
	}

}
