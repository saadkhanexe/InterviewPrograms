package in.NumberProblems;

public class Num21StrongNo {
	
	// Strong number
	// the factorial of number should be the same addition of the number
	
	public static int fact(int num) {
		int fact=1;
		for (int i=1; i<=num; i++) {
			fact*=i;
		}return fact;
	}

	public static void main(String[] args) {
		int num=145;
		int sum=0;
		int temp=num;
		while (num>0) {
			int mod=num%10;
			sum=sum+fact(mod);
			num=num/10;
		}
		if (temp==sum) {
			System.out.println("Strong num");
		}else {
			System.out.println("Not a strong man");
		}
	}

}
