package in.String;

public class Str11CharFreqCount {

	public static void main(String[] args) {
		
		// character frequency count
		
		String input="Programming".toLowerCase();
		int[] count=new int[256];
		for (char c:input.toCharArray()) {
			count[c]++;
		}
		for(int i=0; i<count.length; i++) {
			if(count[i]>0) {
				System.out.println((char)i+" "+count[i]);
			}
		}
	} 

}
