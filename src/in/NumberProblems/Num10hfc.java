package in.NumberProblems;

public class Num10hfc {

	public static void main(String[] args) {
		
		int a=12, b=18;
		
		// method 1
		
		while (a!=b) {
			if(a>b) {
				a=a-b;
			}
			else {
				b=b-a;
			}
		}System.out.println(a);
		
		
		//method 2
		
		while (b!=0) {
			int temp=b;
			b=a%b;
			a=temp;
		}System.out.println(a);
		
	}

}
