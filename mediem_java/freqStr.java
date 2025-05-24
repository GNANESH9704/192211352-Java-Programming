package mediem_java;
import java.util.*;

public class freqStr {
	static  Map<Character,Integer> freq(String n){
		Map<Character,Integer> f=new HashMap<>();
		for(char c:n.toCharArray()) {
			f.put(c, f.getOrDefault(c,0)+1);
		}
		return f;
	}

	public static void main(String[] args) {
		String n="gnanesh";
		Map<Character,Integer> fr=freq(n);
		System.out.println(fr);
	}

}
