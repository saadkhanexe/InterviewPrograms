package in.String;

public class Str9WordRev {

	public static void main(String[] args) {
		
		// reverse the words
		
		String s="Java is fun";
		String[] str=s.split(" ");
		String rev=" ";
		String res="";
		for (int i=str.length-1; i>=0; i--) {
			rev+=str[i]+" ";
		}System.out.println(rev);
		
		// reverse the character
		
		for(int j=s.length()-1; j>=0; j--) {
			res+=s.charAt(j);
		}System.out.println(res);
	}

}
