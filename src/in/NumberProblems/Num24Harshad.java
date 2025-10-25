package in.NumberProblems;

public class Num24Harshad {

	public static void main(String[] args) {
		
		// harshad number
		// num when added it should also be divisible by the sum of num
		
		int num=1878;
		int sum=0;
		int temp=num;
		while (num>0) {
			int mod=num%10;
			sum=sum+mod;
			num=num/10;
		}
		if (temp%sum==0) {
			System.out.println("It is a harshad number");
		}
		else {
			System.out.println("It is not a harshad num");
		}
	}

}
