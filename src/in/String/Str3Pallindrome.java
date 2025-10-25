package in.String;

public class Str3Pallindrome {

	public static void main(String[] args) {
		// check the word is pallindrome

		String s = "Madam";
		String rev = "";
		for (int i = s.length() - 1; i >= 0; i--) {
			rev += s.charAt(i);
		}
		System.out.println(rev);

		if (s.equals(rev)) {
			System.out.println("It is a pallindrome");
		} else {
			System.out.println("It is not a pallindrome");
		}

		// if we want to ignore the case like if it is Lower or Upper

		String a = "Madam";
		String res = "";
		for (int j = a.length() - 1; j >= 0; j--) {
			res += a.charAt(j);
		}
		System.out.println("rev: " + res);

		if (a.equalsIgnoreCase(res)) {
			System.out.println("It is a pallindrome");
		} else {
			System.out.println("It is not a pallindrome");
		}
	}

}
