package in.Patterns;

public class TwentyFiveRev {
	public static void main(String[] args) {
		for (int i=1; i<=5; i++) {
			char a='a';
			for(int j=i;j<=5; j++ ) {
				System.out.print(a++ +" ");
			}System.out.println();
		}

	}
}

//   	output
//
//		a b c d e 
//		a b c d 
//		a b c 
//		a b 
//		a 

// 		reverse of fifteenth