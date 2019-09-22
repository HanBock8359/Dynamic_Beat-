package Ch01;

public class Multi99Table {
	public static void main(String[] args) {
		drawTable1();
		drawTable2();
	}
	
	public static void drawTable1() {
		System.out.println("-----Multiplication Grid-----");
		
		for(int i = 1; i <= 9; i++) {
			for(int j = 1; j <= 9; j++) {
				System.out.printf("%3d", i * j);
			}
			System.out.println();
		}
	}
	
	public static void drawTable2() {
		System.out.println("-----Multiplication Grid-----");
		
		for(int i = 0; i <= 9; i++) {
			if(i == 0) {
				System.out.printf("%3c", '|');
			}
			else {
				System.out.printf("%3d", i);
			}
		}
		
		System.out.println();
		
		for(int i = 0; i <= 9; i++) {
			if(i == 1) {
				System.out.printf("%3s", "+--");
			}
			else {
				System.out.printf("%3s", "---");
			}
		}
		
		System.out.println();

		for(int i = 0; i <= 9; i++) {
			for(int j = 0; j <= 9; j++) {
				if(j == 0) {
					System.out.printf("%2d%c", i+1, '|');
				}
				else {
					System.out.printf("%3d", (i+1) * j);
				}
				
			}
			System.out.println();
		}
	}
}
