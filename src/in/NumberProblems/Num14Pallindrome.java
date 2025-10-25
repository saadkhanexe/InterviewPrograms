package in.NumberProblems;

public class Num14Pallindrome {

	public static void main(String[] args) {
		
		// pallindrome 
		
		int a=121;
		int temp=a;
		int sum=0;
		while (a>0) {
			int mod=a%10;
			sum=(sum*10)+mod;
			a=a/10;
		}
		if (sum==temp) {
			System.out.println("It is a pallindrome");
		}else {
			System.out.println("Not a pallindeome");
		}
	}

}
