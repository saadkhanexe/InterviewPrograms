package in.String;

public class Str6Vowels {

	public static void main(String[] args) {

		// count vowels and consonants
		// method-1

		String s = "Programming".toLowerCase();
		int v = 0;
		int c = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o'
					|| s.charAt(i) == 'u') {
				v++;
			} else {
				c++;
			}
		}
		System.out.println("Vowels: " + v);
		System.out.println("Consonants: " + c);

		// method-2

		char[] a = s.toCharArray();
		for (char m : a) {
			if (m == 'a' || m == 'e' || m == 'i' || m == 'o' || m == 'u') {
				v++;
			} else {
				c++;
			}
		}
		System.out.println("Vowels: " + v);
		System.out.println("Consonants: " + c);
	}

}
