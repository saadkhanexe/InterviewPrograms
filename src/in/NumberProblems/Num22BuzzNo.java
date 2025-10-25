package in.NumberProblems;

public class Num22BuzzNo {

	public static void main(String[] args) {
		
		// buzz no. if a number is either divisible by 7 or ends with 7
		
		int a=7771;
		if (a % 10==7 || a%7==0) {
			System.out.println("it is a buzz num");
		}else {
			System.out.println("not a buzz num");
		}
	}

}
