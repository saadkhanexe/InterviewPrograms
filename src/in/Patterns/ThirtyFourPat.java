package in.Patterns;

public class ThirtyFourPat {

	public static void main(String[] args) {
		
		
//		
//		        for (int i = 1; i <=8; i++) {
//		            for (int j = i; j <= 8; j++) {
//		                System.out.print(" ");
//		            }
//		            for (int j = 1; j <= i; j++) {
//		                if (j==1) {
//		                    System.out.print("*");
//		                }
//		                else{
//		                    System.out.print(" ");
//		                }
//		            }
//		            for (int j = 2; j <= i; j++) {
//		                if (j==i) {
//		                    System.out.print("*");
//		                }
//		                else{
//		                    System.out.print(" ");
//		                }
//		            }
//		            System.out.println();
//		        }
//		        for (int i = 2; i < 8; i++) {
//		            for (int j = 0; j <= i; j++) {
//		                if (j==i) {
//		                    System.out.print("*");
//		                } 
//		                else{
//		                    System.out.print(" ");
//		                }
//		            }
//		            for (int j = i; j <=7; j++) {
//		                System.out.print(" ");
//		            }
//		            for(int j=i;j<=6;j++){
//		                System.out.print(" ");
//		            }
//		            for (int j = 1; j <= i; j++) {
//		                if(j==1){
//		                    System.out.print("*");
//		                } else{
//		                    System.out.print(" ");
//		                }
//		            }
//		            System.out.println();
//		        }
//	
//		
		
		
		
		
		
		
		
		for(int i=0; i<8; i++) {
			for (int j=7; j>=i; j--) {
				System.out.print(" ");
			}System.out.print("*");
			for(int k=1; k<=i;k++) {
				System.out.print(" ");
			}
			for(int l=1; l<=i; l++) {
				System.out.print(" ");
			}System.out.print("*");
			System.out.println();
		}
		for (int m=2; m<=7; m++) {
			for (int n=1; n<=m; n++) {
				System.out.print(" ");
			}System.out.println("*");
			for (int p=5; p>=m; p--) {
				System.out.print("*");
			}System.out.println();
		}
		
	}

}
