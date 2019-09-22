package Ch03;

import java.util.Scanner;

public class Search {
	public static void main(String[] args) {
		int[] test = makeArray();
		
		seqSearch(test, test.length);
		
	}
	
	public static int[] makeArray() {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Number of elements: ");
		int num = in.nextInt();
		int[] x = new int[num];
		
		for(int i = 0; i < num; i++) {
			System.out.printf("x[%d]: ", i);
			x[i] = in.nextInt();
		}
		
		return x;
	}
	
	public static int seqSearch(int[] a, int n) {
		Scanner in = new Scanner(System.in);
		System.out.print("Searching for the value is: ");
		int key = in.nextInt();
		int i = 0;
		
		while(true) {
			if(i == n) {
				return -1;
			}
			if(a[i] == key) {
				return i;
			}
			i++;
		}
		
	}

}
