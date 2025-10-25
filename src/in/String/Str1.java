package in.String;

public class Str1 {

	public static void main(String[] args) {
		
		//method-1
		// print each character in string
		
		String m="Java";
		for (int i=0; i<m.length(); i++) {
			System.out.print(m.charAt(i));
		}
		System.out.println();
		System.out.println("method 2");
		
		// method-2
		// count the number of characters in string
		
		String s="Java";
		char[] c=s.toCharArray();
		for (char ch:c) {
			System.out.println(ch);
		}
	}

}
