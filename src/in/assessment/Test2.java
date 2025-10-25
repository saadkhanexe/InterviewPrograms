package in.assessment;

import java.util.Scanner;

public class Test2 {
public static void main(String[] args) {
	//Write a Java program that takes a string as input and finds the first non-repeating character. If every character repeats, return -1.
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a string:");
	String str = sc.nextLine();
	char[] arr = str.toCharArray();
	int count = 0;
	for (int i = 0; i < arr.length; i++) {
		count = 0;
		for (int j = 0; j < arr.length; j++) {
			if (arr[i] == arr[j] && i != j) {
				count++;
				break;
			}
		}
		if (count == 0) {
			System.out.println("First non-repeating character is: " + arr[i]);
			return;
		}
	}
	System.out.println("-1");
}
}
