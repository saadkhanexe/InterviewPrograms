package in.NumberProblems;

public class Num20SpyNo {

	public static void main(String[] args) {
		
		// spy number
		// the sum of the number should be same as product of the num
		
		int a=22;
		int sum=0;
		int prod=1;
		while (a>0) {
			int mod=a%10;
			sum+=mod;
			prod=prod*mod;
			a/=10;
		}
		
		if(sum==prod) {
			System.out.println("It is a spy num");
		}else {
			System.out.println("not a spy num");
		}
		
		
//		for (int i=0; i<=1000; i++) {
//			//int a=22;
//			int sum=0;
//			int prod=1;
//			while (i>0) {
//				int mod=i%10;
//				sum+=mod;
//				prod=prod*mod;
//				i/=10;
//				System.out.println(i);
//			}
//			
//		}
	}

}
