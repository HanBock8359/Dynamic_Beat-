package Ch06;

import java.util.Scanner;

public class Insertion_Sort {
	public static void insertionSort(int[] a, int n) {
		for(int i = 1; i < n; i++) {
			int j;
			int temp = a[i];
			
			for(j = i; (j > 0 && a[j-1] > temp); j--) {
				a[j] = a[j-1];
			}
			a[j] = temp;
			
		}
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Simple Insertion Sort");
		System.out.print("Number of elements: ");
		int nx = in.nextInt();
		int[] x = new int[nx];
		
		for(int i = 0; i < nx; i++) {
			System.out.print("x[" + i + "] :");
			x[i] = in.nextInt();
		}
		
		insertionSort(x, nx);
		
		System.out.println("Ordered the elements in an ascending order.");
		for(int i = 0; i < nx; i++) {
			System.out.println("x[" + i + "]=" + x[i]);
		}
		
	}
}
