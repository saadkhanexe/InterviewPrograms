package in.Recursion;

public class Rec3 {
	public static void col(int n) {
		if(n==0) {
			return;
		}
		System.out.print("*");
		col(n-1);
	}
	
	public static void row(int col,int row) {
		if(row==0) {
			return;
		}
		col(col);
		System.out.println();
		row(col+1,row-1);
	}

	public static void main(String[] args) {
		row(1,5);
	}
}
