package Question1_3;

public class Question1_3 {

	//Assuming I have the exact amount of spaces needed
	public static char[] URLify(char[] s, int length){
		int pos = s.length - 1;
		for (int i = length - 1; i >= 0 && pos != i; i--){
			if (s[i] != ' '){
				s[pos] = s[i];
				pos --;
			}
			else{
				s[pos] = '0';
				s[pos-1] = '2';
				s[pos-2] = '%';
				pos -= 3;
			}
		}
		return s;
	}
	
	public static void main(String[] args) {
		String str = "abc d e f";
		char[] arr = new char[str.length() + 3 * 2];
		for (int i = 0; i < str.length(); i++) {
			arr[i] = str.charAt(i);
		}
		URLify(arr, str.length());
		String res = new String(arr);
		System.out.println("\"" + res + "\"");
	}
}
