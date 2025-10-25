package in.String;

public class Str10Duplicate {
	
	// remove duplicates
	
	public static void main(String[] args) {
		String input="Programming".toLowerCase();
		String result="";
		boolean[] seen=new boolean[256];
		for(char c:input.toCharArray()) {
			if(!seen[c]) {
				result+=c;
				seen[c]=true;
			}
		}System.out.println(result);
	}
}
