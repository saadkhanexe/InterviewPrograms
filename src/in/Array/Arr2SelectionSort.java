package in.Array;

public class Arr2SelectionSort {
	
	public static void selectionSort(int[] a) {
		int n=a.length;
		for(int i=0; i<n-1; i++) {
			int minIndex=i;
			for(int j=i+1; j<n; j++) {
				if(a[j]<a[minIndex]) {
					minIndex=j;
				}
			}
			int temp=a[i];
			a[i]=a[minIndex];
			a[minIndex]=temp;
		}
	}
	
	public static void main(String[] args) {
		int[] arr = { 4, 1, 5, 2, 3 };
		System.out.println("before sort");
		
		for (int i : arr) {
			System.out.println(i);
		}
		selectionSort(arr);
		System.out.println("After sort");
		for (int i : arr) {
			System.out.println(i);
		}
	}
}
