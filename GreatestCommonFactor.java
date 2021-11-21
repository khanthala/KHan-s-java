package week3Exercise;

import java.util.Scanner;

public class GreatestComFac {

	public static void main(String[] args) {
		int factor;
		System.out.println("Calculate Greatest Common Factor : ");
		Scanner input = new Scanner(System.in);
		System.out.print("number one : ");
		int num1 = input.nextInt();
		System.out.print("number tow : ");
		int num2 = input.nextInt();
		
		if(num1 > num2) {
			factor = num2;
		}else {
			factor = num1;
		}
		
		while ( !(num1 % factor == 0 && num2 % factor == 0)) {
			factor--;
		}
		System.out.println("factor : "+factor);

	}

}
