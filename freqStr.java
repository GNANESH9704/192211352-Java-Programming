package java_class;

import java.util.*;
public class freqStr {
	    public static void main(String[] args) {
	        String str = "hello world";
	        Map<Character, Integer> frequencyMap = getCharacterFrequency(str);
	        System.out.println(frequencyMap);
	    }
	    public static Map<Character, Integer> getCharacterFrequency(String str) {
	        Map<Character, Integer> frequencyMap = new HashMap<>();

	        for (char c : str.toCharArray()) {
	            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
	        }
	        return frequencyMap;
	    }
}
