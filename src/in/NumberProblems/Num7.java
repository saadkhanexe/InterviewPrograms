package in.NumberProblems;

public class Num7 {

	public static void main(String[] args) {
		
//	swap of 2 numbers
		
		 System.out.println("method-1");
		int a=10, b=24;
		int temp=a;
		a=b;
		b=temp;
		System.out.println(a+" "+b);
		
		System.out.println();
		
		System.out.println("method-2");
		int x=10, y=24;
		x=x+y;
		y=x-y;
		x=x-y;
		System.out.println(x+" "+y);
		
		System.out.println();
		
		System.out.println("method-3");
		int q=10, w=20;
		q=q*w;
		w=q/w;
		q=q/w;
		System.out.println(q+" "+w);
	}

}
