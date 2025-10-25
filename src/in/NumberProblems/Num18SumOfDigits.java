package in.NumberProblems;

public class Num18SumOfDigits {

	public static void main(String[] args) {
		
		// sum of digits
		
		int a=123456789;
		int sum=0;
		while (a>0) {
			int mod=a%10;
			sum=sum+mod;
			a=a/10;
		}System.out.println(sum);
	}

}
