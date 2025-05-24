package mediem_java;

public class spceWord {

	public static void main(String[] args) {
		String n="Gnanesh Kumar";
		int l=0;
		for(int i=n.length()-1;i>=0;i--) {
			if(n.charAt(i)==' ') {
				break;
			}
			else {
				l++;
			}
		}
		System.out.println(l);
	}

}
