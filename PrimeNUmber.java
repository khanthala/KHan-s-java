package week3Exercise;

import java.util.Scanner;

public class PrimeNUmber {

	public static void main(String[] args) {
		int PriNumber;
		int count = 0;
		Scanner in = new Scanner (System.in);
		System.out.print("input number : ");
	    PriNumber = in.nextInt();
	    
	    for(int i = 1; i <=PriNumber; i++) {
	    	if (PriNumber %i ==0) {
	    		count++;
	    	}
	    }
	    if(count == 2) {
	    	System.out.println(PriNumber +" is prime number");
	    }else {
	    	System.out.println(PriNumber +" is not prime number");
	    }
	    

	}

}
