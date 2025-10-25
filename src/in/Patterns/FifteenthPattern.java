package in.Patterns;

public class FifteenthPattern {

	public static void main(String[] args) {
		for (int i=1; i<=5; i++) {
			char a='a';
			for(int j=1;j<=i; j++ ) {
				System.out.print(a++ +" ");
			}System.out.println();
		}

	}
}

//	output
//
//	a 
//	a b 
//	a b c 
//	a b c d 
//	a b c d e 

// 	reverse in twentyFive