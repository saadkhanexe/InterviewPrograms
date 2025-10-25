package in.NumberProblems;

public class Num19ProdOfDigits {

	public static void main(String[] args) {
		
		// product of digits
		
		int a=12345;
		int sum=0;
		int prod=1;
		while (a>0) {
			int mod=a%10;
			sum+=mod;
			prod=prod*mod;
			a/=10;
		}System.out.println(prod);
	}

}
