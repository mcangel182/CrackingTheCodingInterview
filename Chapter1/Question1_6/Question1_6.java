package Question1_6;

public class Question1_6 {

	public static String compress(String s){
		StringBuilder res = new StringBuilder();
		int counter = 1;
		char currentChar = s.charAt(0);
		
		for (int i = 1; i < s.length(); i++){
			if (s.charAt(i) == currentChar){
				counter ++;
			}
			else{
				res.append(currentChar);
				res.append(counter);
				currentChar = s.charAt(i);
				counter = 1;
				
				if (res.length() > s.length()) return s;
			}
		}
		
		res.append(currentChar);
		res.append(counter);
		
		return res.length() > s.length() ? s : res.toString();
	}
	
	public static void main(String[] args) {
		String[] strs = {"abbccccccde", "abbccccde", "abc"};
		for (String str : strs){
			String str2 = compress(str);
			System.out.println("Old String (len = " + str.length() + "): " + str);
			System.out.println("New String (len = " + str2.length() + "): " + str2);
		}
	}

}
