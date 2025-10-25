package in.NumberProblems;

import java.util.Scanner;

public class Num9Prime {

	public static void main(String[] args) {
		System.out.println("Enter a number");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		boolean flag = false;
		if (a <= 1) {
			System.out.println("Not a prime");
			return;
		}
		for (int i = 2; i <= a / 2; i++) {
			if (a % i == 0) {
				flag = true;
			}

		}
		if (!flag) {
			System.out.println(a + " is a prime number");
		} else {
			System.out.println(a + " is not a prime number");
		}
	}

}
