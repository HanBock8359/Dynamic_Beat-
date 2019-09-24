package Ch05;

public class QueenB {
	public static boolean[] flag_a = new boolean[8];	// Cross +
	public static boolean[] flag_b = new boolean[15];	// Diagonal /
	public static boolean[] flag_c = new boolean[15];	// Diagonal \
	public static int[] pos = new int[8];

	// prints the positions of queens (a solution at per print() )
	public static void print() {
		System.out.println("-----------------");
		for(int i = 0; i < 8; i++) {
			for(int j = 0; j < 8; j++)
				if(pos[i] == j)
					System.out.printf("%2s", "бс");
				else
					System.out.printf("%2s", "бр");
			System.out.println();
		}
//		System.out.println("-----------------");
	}

	public static void set(int i) {
		for (int j = 0; j < 8; j++) {
			if (flag_a[j] == false &&		//Queen is not set on a row
				flag_b[i+j] == false&&		//Queen is not set on diagonal /
				flag_c[i-j+7] == false) {	//Queen is not set on diagonal \
				
				pos[i] = j;					//place Queen on Row j
				if (i == 7)					//if queens are placed in all columns
					print();				//print out which (row,col) queens are placed
				else {
					flag_a[j] = flag_b[i+j] = flag_c[i-j+7] = true;
					set(i + 1);
					flag_a[j] = flag_b[i+j] = flag_c[i-j+7] = false;
				}
			}
		}
	}

	public static void main(String[] args) {
		System.out.println("Solutions for 8-Queen Problem.");
		set(0);
	}
}
