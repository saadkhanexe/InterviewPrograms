package in.assessment;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string:");
		String str = sc.nextLine();
		char[] ch = str.toCharArray();
		int n = ch.length;
		int count = 0;
		for (int i = 0; i < n; i++) {
			count = 0;
			for (int j = 0; j < n; j++) {
				if (ch[i] == ch[j] && i != j) {
					count++;
					break;
				}
			}
			if (count == 0) {
				System.out.println("First non-repeating character is: " + ch[i]);
				return;
			}
		}
		System.out.println("First non-repeating character: -1");
	}
}
