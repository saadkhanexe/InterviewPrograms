package in.String;

public class Str7CharCount {

	public static void main(String[] args) {
		String s="aabbbcabba".substring(0);
		int count=0;
		char[] c=s.toCharArray();
		for (char word:c) {
			if(word=='a') {
				count++;
			}
		}System.out.println(count);
	}

}
