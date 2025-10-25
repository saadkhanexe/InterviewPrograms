package in.NumberProblems;

public class Practise2 {
	
	public static int countD(int num) {
		int count=0;
		while (num>0) {
			num/=10;
			count++;
		}return count;
	}
	
	public static int pow(int base, int exp) {
		int prod=1;
		for(int i=0; i<exp; i++) {
			prod*=base;
		}return prod;
	}
	
	public static boolean isArmstrong(int num) {
		int exp=countD(num);
		int temp=num;
		int sum=0;
		
		while(num>0) {
			int mod=num%10;
			sum=sum+pow(mod, exp);
			num/=10;
		} 
		if (temp==sum)
			return true;
		else
			return false;
	}
	
	public static void main(String[] args) {
		System.out.println(isArmstrong(152));
		
		
	}
}
