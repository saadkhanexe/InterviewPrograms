package in.String;

public class Str16Substring {

	public static void main(String[] args) {
		
		// print Substring
		
		String str="abcd";
		for(int i=0; i<str.length(); i++) {
			for(int j=i; j<str.length(); j++) {
				System.out.println(str.substring(i,j+1));
			}
		}
	}

}
