package Question1_5;

public class Question1_5 {

	public static boolean oneWay(String s1, String s2){
		
		int dif = s1.length() - s2.length();
		if(Math.abs(dif) > 1) return false;
		
		int pos1 = 0;
		int pos2 = 0;
		boolean foundDif = false;
		
		while(pos1 < s1.length() && pos2 < s2.length()){
			if (s1.charAt(pos1) != s2.charAt(pos2)){
				if (dif == 0){
					if (foundDif) return false;
					foundDif = true;
				}
				else{
					if (dif == 1) pos2--;
					else pos1--;
				}
			}
			pos1++;
			pos2++;
		}
		return true;
	}
	
	public static void main(String[] args) {
		String[][] pairs = {{"pale", "ple"}, {"pales", "pale"}, {"pale", "bale"}, {"pale", "bake"}};
		for (String[] pair : pairs) {
			String word1 = pair[0];
			String word2 = pair[1];
			System.out.println(word1 + ", " + word2 + ": " + oneWay(word1, word2));
		}
	}

}
