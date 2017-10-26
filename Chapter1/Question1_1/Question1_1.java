package Question1_1;

import java.util.HashSet;

public class Question1_1 {

	public static boolean isUnique(String s){
		HashSet<Character> hash = new HashSet<Character>();
		for(int i = 0; i < s.length(); i++){
			Character currentChar = s.charAt(i);
			if(hash.contains(currentChar)){
				return false;
			}
			hash.add(currentChar);
		}
		return true;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] words = {"abcde", "hello", "apple", "kite", "padle"};
		for (String word : words) {
			System.out.println(word + ": " + isUnique(word));
		}
	}

}