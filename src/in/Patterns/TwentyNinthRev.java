package in.Patterns;

public class TwentyNinthRev {

	public static void main(String[] args) {
		char a='a';
		for (int i=1; i<=5; i++) {
			for(int j=i;j<=5; j++ ) {
				System.out.print(a+" ");
			}a++;
			System.out.println();
		}
	}

}


//		output
//		
//		a a a a a 
//		b b b b 
//		c c c 
//		d d 
//		e 
//		
//		reverse of fourteenth