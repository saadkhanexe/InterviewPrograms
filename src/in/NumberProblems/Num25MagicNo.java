package in.NumberProblems;

public class Num25MagicNo {
	
	//	recursive sum of digits leads to 1
	
	public static int sumOfDigits(int num) {
		int sum=0;
		
		while (num>0) {
			int mod=num%10;
			sum+=mod;
			num=num/10;
		}
		return sum;
	}
	
	
	public static void main(String[] args) {
		int num=1729;
		while (num>9) {
			num=sumOfDigits(num);
		}
		if(num==1) {
			System.out.println("Magic num");
		} 
		else {
			System.out.println("not a magic number");
		}
		
		
}
}
