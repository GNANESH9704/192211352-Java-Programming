package java_class;

import java.util.ArrayList;
import java.util.Iterator;

public class arraList {
	public static void main(String[] args) {
		ArrayList<String> a = new ArrayList<>();
		a.add("Gnanesh");
		a.add("Kousik");
		a.add("Nani");
		a.add("Chotu");
		Iterator<String> i = a.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
	}
}