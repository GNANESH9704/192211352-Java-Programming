package mediem_java;

public class specialChar {

	public static void main(String[] args) {
		String n="Gnanesh@&*$";
		int co=0;
		for(char c:n.toCharArray()) {
			if(!Character.isLetterOrDigit(c) && !Character.isWhitespace(c)) {
				co++;
			}
		}
		System.out.println("count: "+co);
	}

}
