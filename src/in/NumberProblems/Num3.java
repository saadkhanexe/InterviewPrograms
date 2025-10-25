package in.NumberProblems;

//import java.util.Scanner;

public class Num3 {
	public static void main(String[] args) {
		
		//check if the number is odd or even
		
//  method-1
//		System.out.println("Enter a number to check if it even or odd:");
//		Scanner sc=new Scanner(System.in);
//		int a=sc.nextInt();
//		if (a%2==0) {
//			System.out.println("Number is even"); 
//		}else {
//			System.out.println("Number is odd");
//		}
	
	
	
	
// 	method-2
//		int a=12345;
//		String s=(a%2==0)?"Number is even":"Number is odd";
//		System.out.println(s);
	

// method -3
	
	int a=231;
	String[] res={"even","odd"};
	System.out.println(res[a%2]);
	}
}
