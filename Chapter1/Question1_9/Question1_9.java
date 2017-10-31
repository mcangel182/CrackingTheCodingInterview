package Question1_9;

public class Question1_9 {

	public static boolean isRotation(String s1, String s2){
		if (s1.length() == s2.length()){
			StringBuilder sb = new StringBuilder();
			sb.append(s1);
			sb.append(s1);
			return sb.toString().contains(s2);
		}
		
		return false;
	}
	
	public static void main(String[] args) {

		String[][] pairs = {{"apple", "pleap"}, {"waterbottle", "erbottlewat"}, {"camera", "macera"}};
		for (String[] pair : pairs) {
			String word1 = pair[0];
			String word2 = pair[1];
			boolean is_rotation = isRotation(word1, word2);
			System.out.println(word1 + ", " + word2 + ": " + is_rotation);
		}

	}

}
