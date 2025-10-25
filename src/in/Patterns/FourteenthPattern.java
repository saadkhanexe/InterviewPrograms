package in.Patterns;

public class FourteenthPattern {

	public static void main(String[] args) {
		char a='a';
		for (int i=1; i<=5; i++) {
			for(int j=1;j<=i; j++ ) {
				System.out.print(a+" ");
			}a++;
			System.out.println();
		}
	}

}


//	output
//	
//	a 
//	b b 
//	c c c 
//	d d d d 
//	e e e e e 

// 	reverse in twentyNinth
