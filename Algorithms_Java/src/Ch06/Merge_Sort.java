package Ch06;

import java.util.Scanner;

public class Merge_Sort {
	public static int[] buff;
	
	public static void __mergeSort(int[] a, int left, int right) {
		if(left < right) {
			int i;
			int center = (left+right) / 2;
			int p = 0;
			int j = 0;
			int k = left;
			
			__mergeSort(a, left, center);		//sort left half
			__mergeSort(a, center + 1, right);	//sort right half
			
			for(i = left; i <= center; i++)
				buff[p++] = a[i];
			
			while(i <= right && j < p)
				a[k++] = (buff[j] <= a[i] ? buff[j++] : a[i++]);
			
			while(j < p)
				a[k++] = buff[j++];
		}
	}
	
	public static void mergeSort(int[] a, int n) {
		buff = new int[n];
		
		__mergeSort(a, 0, n - 1);
		
		buff = null;
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Merge Sort");
		System.out.print("Number of elements: ");
		int nx = in.nextInt();
		int[] x = new int[nx];
		
		for(int i = 0; i < nx; i++) {
			System.out.print("x[" + i + "] : ");
			x[i] = in.nextInt();
		}
		
		mergeSort(x, nx);
		
		System.out.println("Sorted in an ascedning order.");
		for(int i = 0; i < nx; i++) {
			System.out.println("x[" + i + "] = " + x[i]);
		}
		
	}
}
