package in.String;

public class Str14Anagram {

	public static void main(String[] args) {
		
		// anagram- word formed by rearranging the other word
		
		String s="cat".replaceAll("\\s", "").toLowerCase();
		String s1="atc".replaceAll("\\s", "").toLowerCase();
		int[] count=new int[256];
		
		if(s.length()!=s1.length()) {
			System.out.println("Not an anagram");
			return;
		}
		
		for(char c:s.toCharArray()) {
			count[c]++;
		}
		 
		for(char ch:s1.toCharArray()) {
			count[ch]--;
		}
		
		for(int i=0; i<count.length; i++) {
			if(count[i]!=0) {
				System.out.println("not an anagram");
				return;
			}
		}
		System.out.println("It is an anagram");
	}

}
