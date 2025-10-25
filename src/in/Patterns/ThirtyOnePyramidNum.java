package in.Patterns;

public class ThirtyOnePyramidNum {

	public static void main(String[] args) {
		int a=1;
		for (int i=1; i<=5; i++) {
			for (int j=i; j<=5; j++) {
				System.out.print(" ");
			}
			for (int k=1; k<=i; k++) {
				System.out.print(a+" ");
				a++;
			}
			for (int l=2; l<=i; l++) {
				System.out.print(a+" ");
				a++;
			}
			System.out.println();
		}
	}

}


//		output
//		
//			       1 
//			     2 3 4 
//		       5 6 7 8 9 
//		   10 11 12 13 14 15 16 
//		17 18 19 20 21 22 23 24 25 

