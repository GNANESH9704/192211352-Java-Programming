package mediem_java;

import java.util.Arrays;
import java.util.HashSet;

public class dupliactes {

	public static void main(String[] args) {
		HashSet<Integer> h=new HashSet<>();
		h.add(1);
		h.add(3);
		h.add(5);
		h.add(3);
		h.add(7);
		h.add(1);
		System.out.println(h);
	}

}
