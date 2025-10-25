package in.NumberProblems;

import java.util.Scanner;

public class Num11Lcm {
	
	//lcm =(a*b)/hcf

	public static void main(String[] args) {
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter a value:");
//		int a=sc.nextInt();
//		System.out.println("Enter b value:");
//		int b=sc.nextInt();
		
		// method 1
		
//		int a=12, b=18;
//		int s=a*b;
//		while (a!=b) {
//			if(a>b) {
//				a=a-b;
//			}
//			else {
//				b=b-a;
//			}
//		}System.out.println(a);
//		
//		
//		
//		int lcm=s/ a;
//		System.out.println(lcm);
		
		
		
		//method 2
		
		int a=12, b=18;
		int max=a>b?a:b;
		int lcm=max;
		while (true) {
			if(lcm%a==0 && lcm%b==0) {
				break;
			}
			lcm+=max;
		}
		
		System.out.println(lcm);
	}

}
