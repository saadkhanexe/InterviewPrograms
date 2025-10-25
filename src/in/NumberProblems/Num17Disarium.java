package in.NumberProblems;

public class Num17Disarium {
	
	// disarium number
	// the sum of the power of digits based on the respective postion
	// 145= 1 pow(1)+ 4 pow(2) + 5 pow(3)

	public static int count(int num) {
		int count=0;
		while (num>0) {
			num=num/10;
			count++;
		}return count;
	}
	
	public static int pow(int base, int exp) {
		int prod=1;
		for (int i=0;i<exp; i++) {
			prod=prod*base;
		}return prod;
	}
	
	public static boolean isArmstrong(int num) {
		int exp=count(num);
		int sum=0;
		int temp=num;
		
		while (num>0) {
			int mod=num%10;
			sum=sum+pow(mod,exp);
			num=num/10;
			exp--;
		}
		if(temp==sum) 
			return true;
		else
			return false;
		
	}
	
	public static void main(String[] args) {
		System.out.println(isArmstrong(135));
	}

}
