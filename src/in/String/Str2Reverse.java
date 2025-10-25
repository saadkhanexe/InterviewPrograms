package in.String;

public class Str2Reverse {

	public static void main(String[] args) {

		// reverse a string
		// method - 1

		String s = "Java";
		String rev = "";
		for (int i = s.length() - 1; i >= 0; i--) {
			rev += s.charAt(i);
		}
		System.out.println("rev: " + rev);

		// method - 2

		String a = "Java";
		String res = "";
		for (int j = 0; j < a.length(); j++) {
			res = a.charAt(j) + res;
		}
		System.out.println("rev: " + res);
	}

}
