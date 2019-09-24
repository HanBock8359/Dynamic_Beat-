package Ch06;

import java.util.Scanner;

public class Quick_Sort {
	public static void swap(int[] a, int index1, int index2) {
		int t = a[index1];
		a[index1] = a[index2];
		a[index2] = t;
	}
	
	public static void partition(int[] a, int n) {
		int pLeft = 0;
		int pRight = n - 1;
		int x = a[n/2];		//Select pivot in the middle
		
		do {
			while(a[pLeft] < x) pLeft++;
			while(a[pRight] > x) pRight--;
			
			if(pLeft <= pRight)
				swap(a, pLeft++, pRight--);	//swap the value and alter the value of pLeft and pRight by 1
			
		} while(pLeft <= pRight);
		
		/*
		System.out.println("The value of pivot is : " + x);
		
		// Smaller values than pivots
		System.out.println("The values that are smaller than the pivot,");
		for(int i = 0; i < pLeft; i++)
			System.out.println(a[i] + " ");
		System.out.println();
		
		// Equal values like pivots
		if(pLeft > pRight + 1) {
			System.out.println("The values that are equal to the pivot");
			for(int i = pRight + 1; i <= pLeft - 1; i++)
				System.out.println(a[i] + " ");
			System.out.println();
		}
		
		// Greater values than pivots
		System.out.println("The values that are greater than the pivot,");
		for(int i = pRight + 1; i < n; i++)
			System.out.println(a[i] + " ");
		System.out.println();
		*/
	}
	
	public static void quickSort(int[] a, int left, int right) {
		int pl = left;
		int pr = right;
		int x = a[(pl+pr)/2];
		
		// Prints
		System.out.printf("a[%d] ~ a[%d] : {", left, right);
		for(int i = left; i < right; i++)
			System.out.printf("%d, ", a[i]);
		System.out.printf("%d}\n", a[right]);
		
		do {
			while(a[pl] < x) pl++;
			while(a[pr] > x) pr--;
			
			if(pl <= pr)
				swap(a, pl++, pr--);
			
		} while(pl <= pr);
		
		if(left < pr) quickSort(a, left, pr);
		if(pl < right) quickSort(a, pl, right);
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Partitioning the array.");
		System.out.print("Number of elements:");
		
		int nx = in.nextInt();	//size of array
		int[] x = new int[nx];
		
		for(int i = 0; i < nx; i++) {
			System.out.print("x[" + i + "] : ");
			x[i] = in.nextInt();
		}
		
		quickSort(x,0, nx-1);
		
		System.out.println("Sorted in an ascending order.");
		for(int i = 0; i < nx; i++) {
			System.out.println("x[" + i + "] = " + x[i]);
		}
		
	}
}
