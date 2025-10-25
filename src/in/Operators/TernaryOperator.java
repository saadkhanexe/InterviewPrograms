package in.Operators;

public class TernaryOperator {
	public static void main(String[] args) {
		int x=10;
		int y=5;
		
		boolean result=(x>y)?true:false;
		System.out.println("result: "+result);
		
		boolean result1=(x==y)?true:false;
		System.out.println(result1);
		
		String s=(x<y)?"x is bigger":"y is bigger";
		System.out.println(s);
	}
	
	
}
