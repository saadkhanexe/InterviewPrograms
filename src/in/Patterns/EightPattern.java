package in.Patterns;

public class EightPattern {

	public static void main(String[] args) {
		
		for (int i=1; i<=5; i++) {
			char a='A';
			for (int j=1; j<=5; j++) {
				System.out.print(a++ +" ");
			}
			System.out.println();
		}
	}

}

//	output
//	
//	A B C D E 
//	A B C D E 
//	A B C D E 
//	A B C D E 
//	A B C D E 

	