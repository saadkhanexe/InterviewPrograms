package in.NumberProblems;


public class Num23LargeSmall {

	public static void main(String[] args) {
		
		// find largest and small number
		
		int num=9234;
		int l=1, s=9;
		while (num>0) {
			int mod=num%10;
			if (mod<s) {
				s=mod;
			}
			if (mod>l) {
				l=mod;
			}
			num/=10;
		}
		System.out.println(s+" "+l);
	}

}
