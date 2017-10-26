package Question1_2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class Question1_2 {

	public static boolean checkPermutation2(String s1, String s2){
		if (s1.length() != s2.length()) return false;
		
		int[] freq = new int[128]; //ASCII
		
		for (int i = 0; i < s1.length(); i++){
			int currentChar = s1.charAt(i);
			freq[currentChar]++;
		}
		
		for (int i = 0; i < s2.length(); i++){
			Character currentChar = s2.charAt(i);
			freq[currentChar]--;
			if (freq[currentChar] < 0) return false;
			
		}
		
		return true;
	}
	
	public static boolean checkPermutation(String s1, String s2){
		if (s1.length() != s2.length()) return false;
		
		HashMap<Character, Integer> freq = new HashMap<Character, Integer>();
		
		// Determine frequency of chars in s1
		for (int i = 0; i < s1.length(); i++){
			Character currentChar = s1.charAt(i);
			int count = freq.containsKey(currentChar) ? freq.get(currentChar) : 0;
			freq.put(currentChar, count + 1);
		}
		
		// Substract frequency of chars in s2 to the frequency of chars in s1
		for (int i = 0; i < s2.length(); i++){
			Character currentChar = s2.charAt(i);
			int count = freq.containsKey(currentChar) ? freq.get(currentChar) : 0;
			if (count - 1 < 0){
				return false;
			}
			freq.put(currentChar, count - 1);
		}
		
		// Iterate through freq to verify that all entries are 0
		Iterator it = freq.entrySet().iterator();
		while (it.hasNext()) {
	        HashMap.Entry pair = (HashMap.Entry)it.next();
	        if ((int) pair.getValue() > 0) return false;
	    }
		
		return true;
	}

	public static void main(String[] args) {
		String[][] pairs = {{"apple", "papel"}, {"carrot", "tarroc"}, {"hello", "llloh"}};
		for (String[] pair : pairs) {
			String word1 = pair[0];
			String word2 = pair[1];
			System.out.println(word1 + ", " + word2 + ": " + checkPermutation(word1, word2) + ", " + checkPermutation2(word1, word2));
		}
	}
	
}
