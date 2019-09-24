package Ch06;

import java.util.Scanner;

public class Bubble_Sort {
	public static void swap(int[] a, int index1, int index2) {
		int t = a[index1];
		a[index1] = a[index2];
		a[index2] = t;
	}

	// You can improve the algorithm by checking if the swap was done or not
	// If swap is not done, then that means the array is already sorted,
	// Therefore, you can terminate the loop at that moment
	public static void bubbleSort(int[] a, int n) {
		int exchange = 0;					//record if the swap is done
		for (int i = 0; i < n - 1; i++) {
			for (int j = n - 1; j > i; j--)
				if (a[j - 1] > a[j]) {
					swap(a, j - 1, j);
					exchange++;
				}	
			if(exchange == 0) break;		//is not swapped, finish the loop
		}
	}
	
	public static void selectionSort(int a[], int n) {
		for(int i = 0; i < n - 1; i++) {
			int min = i;
			
			for(int j = i + 1; j < n; j++) {
				if(a[j] < a[min])
					min = j;
			}
			
			swap(a, i, min);
		}
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.println("Bubble sort ver1");
		System.out.print("Number of elements: ");

		int nx = in.nextInt();
		int[] x = new int[nx];

		for (int i = 0; i < nx; i++) {
			System.out.printf("x[%d]: ", i);
			x[i] = in.nextInt();
		}

		bubbleSort(x, nx);

		System.out.println("Ordered in ascending order.");

		for (int i = 0; i < nx; i++) {
			System.out.printf("x[%d]: %d\n", i, x[i]);
		}
	}
}
