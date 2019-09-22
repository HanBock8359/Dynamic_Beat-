package Ch01;
import java.util.Scanner;

public class Max3 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Finding the largest value of three given nubmers.");
		System.out.println("The value of a: "); int a = in.nextInt();
		System.out.println("The value of b: "); int b = in.nextInt();
		System.out.println("The value of c: "); int c = in.nextInt();
		
		System.out.println("The largest number is: " + max3(a,b,c));
		
		System.out.println("The smallest number is: " + min3(a,b,c));
	}
	
	public static int max3(int a, int b, int c) {
		int max = a;
		
		if(b > max) max = b;
		if(c > max) max = c;
		
		return max;
	}
	
	public static int max4(int a, int b, int c, int d) {
		int max = a;
		
		if(b > max) max = b;
		if(c > max) max = c;
		if(d > max) max = d;
		
		return max;
	}
	
	public static int min3(int a, int b, int c) {
		int min = a;
		
		if(b < min) min = b;
		if(c < min) min = c;
		
		return min;
	}
	
	public static int min4(int a, int b, int c, int d) {
		int min = a;
		
		if(b < min) min = b;
		if(c < min) min = c;
		if(d < min) min = d;
		
		return min;
	}
}
