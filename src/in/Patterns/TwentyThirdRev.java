package in.Patterns;

public class TwentyThirdRev {

	public static void main(String[] args) {
		int a=0;
		int b=1;
		for (int i=0; i<=5; i++) {
			for (int j=i; j<=5; j++) {
				if(i%2==0) {
					System.out.print(a+" ");
				}else {
					System.out.print(b+" ");
				}
			}System.out.println();
		}
	}

}

// output

//	0 0 0 0 0 0 
//	1 1 1 1 1 
//	0 0 0 0 
//	1 1 1 
//	0 0 
//	1 

//  reverse of sixteenth