package in.Recursion;

public class Rec2 {
	public static void col(int n) {
		if(n==0) {
			return;
		}
		System.out.print("*");
		col(n-1);
	}
	
	public static void row(int col, int row) {
		if(row==0) {
			return;
		}
		col(col);
		System.out.println();
		row(col,row-1);
	}
	
	public static void main(String[] args) {
		row(5,5);
	}
}
