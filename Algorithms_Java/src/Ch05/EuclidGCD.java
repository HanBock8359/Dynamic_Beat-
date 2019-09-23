package Ch05;

import java.util.Scanner;

public class EuclidGCD {
	public static int gcd(int x, int y) {
		if (y == 0)
			return x;
		else
			return gcd(y, x % y);
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Find the greatest common divisor of two given integers.");
		
		System.out.print("Enter the first integer: "); int x = in.nextInt();
		System.out.print("Enter the second integer: "); int y = in.nextInt();
		
		System.out.println("GCD of x and y is: " + gcd(x,y));
	}
	
}
