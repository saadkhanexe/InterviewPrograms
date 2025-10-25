package in.Recursion;

public class Rec4Rev {
	public static int rev(int num, int rev) {
		if(num==0) {
			return rev;
		}
		return rev(num/10, rev*10+num%10);
	}
	
	public static void main(String[] args) {
		System.out.println(rev(12345,0));
	}
}
