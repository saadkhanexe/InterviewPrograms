package in.Patterns;

public class TwentySeventhRev {

	public static void main(String[] args) {
		int a=15;
		for (int i=1; i<=5; i++) {
			for(int j=i;j<=5; j++ ) {
				System.out.print(a+" ");
				a--;
			}System.out.println();
		}
	}
}

//		Output
//		
//		15 14 13 12 11 
//		10 9 8 7 
//		6 5 4 
//		3 2 
//		1 
//		
//		reverse of Twelfth