package Ch05;

import java.util.Scanner;

public class Factorial {
	public static int factorial(int n) {
		if(n > 0)
			return n * factorial(n-1);
		else
			return 1;
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter an integer: ");
		int x = in.nextInt();
		
		System.out.println("The factorial of x is: " + factorial(x));
		
	}
}
