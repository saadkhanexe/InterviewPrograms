package in.Patterns;

public class TwentyEightRev {

	public static void main(String[] args) {
		char a='a';
		for (int i=1; i<=5; i++) {
			for(int j=i;j<=5; j++ ) {
				System.out.print(a++ +" ");
			}System.out.println();
		}
	}

}


//		output
//		
//		a b c d e 
//		f g h i 
//		j k l 
//		m n 
//		o 
//		
//		reverse of thirteenth