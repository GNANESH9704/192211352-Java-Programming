package mediem_java;

public class polindrome {

	public static void main(String[] args) {
		String n="MADAM";
		String m="";
		for(int i=n.length()-1;i>=0;i--) {
			m+=n.charAt(i);
		}
		if(n.equals(m)) {
			System.out.println("Polindrome");
		}
		else {
			System.out.println("Not polindrome");
		}
	}
}
