package Question1_4;

public class Question1_4 {

	public static boolean palindromePermutation(String s){
		
		s = s.toLowerCase();
		int[] set = new int[128];
		int length = 0;
		
		for (int i = 0; i < s.length(); i++){
			if (s.charAt(i) != ' '){
				length ++;
				set[s.charAt(i)]++;
			}
		}
		
		int oddAllowed = length % 2;
		
		for (int i = 0; i < 128; i++){
			if (set[i] % 2 == 1){
				oddAllowed--;
				if (oddAllowed < 0) return false;
			}
		}
		
		return true;
		
	}
	
	public static void main(String[] args) {
		String[] words = {"Tact coa", "taco cat", "apple", "loop polo", "moon"};
		for (String word : words) {
			System.out.println(word + ": " + palindromePermutation(word));
		}
	}

}
