package in.String;

public class Str4LowerNUpper {

	public static void main(String[] args) {

		// convert upper to lower
		String a = "SaaD";
		String l = "";
		char[] ch = a.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] >= 65 && ch[i] <= 90) {
				char lower = (char) (ch[i] + 32);
				l += lower;
			} else {
				l += ch[i];
			}
		}
		System.out.println("lower: " + l);

		// convert lower to upper

		String s = "khaN";
		String m = "";
		char[] c = s.toCharArray();

		for (int j = 0; j < c.length; j++) {
			if (c[j] >= 97 && c[j] <= 122) {
				char upper = (char) (c[j] - 32);
				m += upper;
			} else {
				m += c[j];
			}
		}
		System.out.println("upper: " + m);

	}

}
