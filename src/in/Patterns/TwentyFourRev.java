package in.Patterns;

public class TwentyFourRev {

	public static void main(String[] args) {
		for(int i=0; i<=5; i++) {
			char a=65;
			char b=98;
			for (int j=0; j<=5-i; j++) {
				if (j%2==0) {
					System.out.print(a+" ");
					a=(char) (a+2);
				}else {
					System.out.print(b+" ");
					b=(char)(b+2);
				}
			}
			System.out.println();
		}
	}

}

// output

//		A b C d E f 
//		A b C d E 
//		A b C d 
//		A b C 
//		A b 
//		A 

// 		reverse of seventeenth