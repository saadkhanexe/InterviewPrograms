package in.Patterns;

public class ThirtyTwoPyramidNum2 {

	public static void main(String[] args) {
		for (int i=1; i<=5; i++) {
			for (int j=i; j<=5; j++) {
				System.out.print(" ");
			}
			for (int k=1; k<=i; k++) {
				System.out.print(i+" ");
			}
			for (int l=2; l<=i; l++) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
	}

}


//		output
//		
//		        1 
//		      2 2 2 
//		    3 3 3 3 3 
//	   	  4 4 4 4 4 4 4 
//		5 5 5 5 5 5 5 5 5 
