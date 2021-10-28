package methodEx;

import java.util.Scanner;

public class MathAbs {

	public static void main(String[] args) {
		int i, j, k, abs;
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter value of Math.abs : ");
		abs = scan.nextInt();
		Math.abs(abs);
		scan.close();
		for( i = 1; i <= abs; i++) {
			//Show(abs);
			for(j = i; j < abs; j++) {
				Math.abs(abs);
				System.out.print(" ");
			}
			for(k = 1; k < (i * 2); k++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
		for(i = abs -1; i >= 1; i--) {
			for(j = abs; j > i; j--) {
				System.out.print(" ");
			}
			for(k = 1; k < (i * 2); k++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}

	}
	public static void Show(int n) {
		
		for(int i = 0; i < n ; i++ ) {
			System.out.print(" ");
		}
	}
		

}
