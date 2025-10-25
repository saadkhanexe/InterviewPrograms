package in.String;

public class Str5Toggle {

	public static void main(String[] args) {
		
		// Toggle case
		
		String a = "SaaD";
		String l = "";
		char[] ch = a.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] >= 65 && ch[i] <= 90) {
				char lower = (char) (ch[i] + 32);
				l += lower;
			} 
			else if (ch[i] >= 97 && ch[i] <= 122) {
				char lower = (char) (ch[i] - 32);
				l += lower;
			}
		}
		System.out.println("toggle: " + l);
	}

}
