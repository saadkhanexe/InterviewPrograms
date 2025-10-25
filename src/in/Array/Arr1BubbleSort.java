package in.Array;

public class Arr1BubbleSort {

	public static void bubbleSort(int[] a) {
		int n = a.length;
		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				if (a[j] > a[j + 1]) {
					int temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}
		}

	}

	public static void main(String[] args) {
		System.out.println("Before sorting");
		int[] arr = { 4, 1, 5, 2, 3 };
		for (int i : arr) {
			System.out.println(i);
		}
		bubbleSort(arr);
		System.out.println("After sort");
		for (int i : arr) {
			System.out.println(i);
		}

	}

}
