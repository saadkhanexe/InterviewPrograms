package in.String;

public class Str13HighestLen {

	public static void main(String[] args) {

		// print the highest length

		String input = "Ram and Raja are studying btech";
		String[] str = input.split("\\s+");
//		int initialLen = 0;
//		for (String s : str) {
//			int length = s.length();
//
//			if (length > initialLen) {
//				initialLen = length;
//			}
//		}
//		System.out.println(initialLen);
		
		
		
		String longestWord=str[0];
		for(int i=0; i<str.length; i++) {
			if(str[i].length()>longestWord.length()) {
				longestWord=str[i];
			}
		}System.out.println(longestWord);
		
		
		
	}

}
