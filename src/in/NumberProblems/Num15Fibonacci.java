package in.NumberProblems;

public class Num15Fibonacci {

	public static void main(String[] args) {
		
		// fibonacci 
		int a=0, b=1;
		System.out.print(a);
		System.out.print(" ");
		System.out.print(b);
		for (int i=0; i<=10; i++) {
			int c=a+b;
			a=b; b=c;
			System.out.print(" "+c);
		}
	}

}
