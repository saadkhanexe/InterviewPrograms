package in.Patterns;

public class ThirtyThreePat {

	public static void main(String[] args) {
		for (int i=0; i<=5; i++) {
			for (int j=0; j<=i; j++) {
				System.out.print("*");
			}
			for (int k=i; k<5; k++) {
				System.out.print(" ");
			}
			for(int l=i; l<5; l++) {
				System.out.print(" ");
			}
			for(int m=0; m<=i; m++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int n=1; n<=5; n++) {
			for (int p=5; p>=n;p--) {
				System.out.print("*");
			}
			for (int q=1; q<=n; q++) {
				System.out.print(" ");
			}
			for (int r=1; r<=n; r++) {
				System.out.print(" ");
			}
			for (int s=n; s<=5; s++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
