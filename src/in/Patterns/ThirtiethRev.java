package in.Patterns;

public class ThirtiethRev {

	public static void main(String[] args) {
		
		for (int i=1;i<=5; i++) {
			for (int j=1; j<=i; j++) {
				System.out.print("*");
			}
			for(int k=i; k<5; k++) {
				System.out.print(" ");
			}
			for(int l=i; l<5; l++) {
				System.out.print(" ");
			}
			for(int m=1; m<=i; m++) {
				System.out.print("*");
			}
			System.out.println();
			
		}
	}
}

//		output
//		
//		*        *
//		**      **
//		***    ***
//		****  ****
//		**********
//		
//		reverse of eighteenth
