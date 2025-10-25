package in.NumberProblems;

public class Num13Rev {

	public static void main(String[] args) {
		int a=1234;
		int sum=0;
		while (a>0) {
			int mod=a%10;
			sum=(sum*10)+mod;
			a=a/10;
		}
		System.out.println(sum);
	}

}
