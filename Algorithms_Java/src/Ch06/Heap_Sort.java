package Ch06;

import java.util.Scanner;

public class Heap_Sort {
	// Swaps two elements in an array
	public static void swap(int[] a, int index1, int index2) {
		int t = a[index1];
		a[index1] = a[index2];
		a[index2] = t;
	}
	
	public static void downHeap(int[] a, int left, int right) {
		int temp = a[left];
		int child;
		int parent;
		
		for(parent = left; parent < (right+1)/2; parent = child) {
			int cl = parent * 2 + 1;	//child left
			int cr = cl + 1;			//child right
			
			child = (cr <= right && a[cr] > a[cl]) ? cr : cl;
			
			if(temp >= a[child])
				break;
			a[parent] = a[child];
		}
		a[parent] = temp;
	}
	
	public static void heapSort(int[] a, int n) {
		for(int i = (n-1) / 2; i >= 0; i--) {
			downHeap(a, i , n - 1);
		}
		
		for(int i = n-1; i > 0; i--) {
			swap(a,0,i);
			downHeap(a,0,i-1);
		}
	}
	
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Heap sort");
		System.out.print("Number of elements: ");
		int nx = in.nextInt();
		int[] x = new int[nx];
		
		for(int i = 0; i < nx; i++) {
			System.out.printf("x[%d] : ", i);
			x[i] = in.nextInt();
		}
		
		heapSort(x, nx);
		
		System.out.println("Sorted in an ascending order.");
		for(int i = 0; i < nx; i++) {
			System.out.printf("x[%d] = %d\n",i, x[i]);
		}
		
		
	}
}
