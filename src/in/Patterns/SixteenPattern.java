package in.Patterns;

public class SixteenPattern {

	public static void main(String[] args) {
		int a=0;
		int b=1;
		for (int i=0; i<=5; i++) {
			for (int j=0; j<=i; j++) {
				if(i%2==0) {
					System.out.print(a+" ");
				}else {
					System.out.print(b+" ");
				}
			}System.out.println();
		}
	}
}


//	output
//	
//	0 
//	1 1 
//	0 0 0 
//	1 1 1 1 
//	0 0 0 0 0 
//	1 1 1 1 1 1 

//  reverse in twentyThird