package week3Exercise;

import java.util.Scanner;

public class CalObese {

	public static void main(String[] args) {
		//Calculate Obese
		
		Scanner sca = new Scanner (System.in);
		System.out.print("intput your Weigh : ");
		int wei = sca.nextInt();
		System.out.print("intput your Height : ");
		int hei = sca.nextInt();
		
		int Result = wei + 100 - hei;
		
		if(Result > 0) {
			System.out.println("your are Obese!");
		}else if(Result < 0) {
			System.out.println("Handsome Guy ^^");
		}else {
			System.out.println("Something Worng");
		}

	}

}
