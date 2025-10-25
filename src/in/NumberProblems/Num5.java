package in.NumberProblems;

public class Num5 {

	public static void main(String[] args) {
		
		// print odd numbers between a range
		
		int a=10, b=30;
		for (int i=a; i<=b; i++) {
			if(i%2!=0) {
				System.out.println(i);
			}
		}
	}

}
