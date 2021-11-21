package week3Exercise;

import java.util.Scanner;

public class minusNumber {

	public static void main(String[] args) {
		int num;
		Scanner sca = new Scanner(System.in);
		System.out.print("input number : ");
		num = sca.nextInt();
		
		if(num > 0) {
			System.out.println(num +" \n Positive");
		}else if(num < 0) {
			System.out.println(num +" \n minus");
		}else {
			System.out.println("Zero number");
		}

	}

}
