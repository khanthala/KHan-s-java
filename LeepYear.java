import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		System.out.print("Enter any Year : ");
		Scanner in  = new Scanner(System.in);
		int year = in.nextInt();
		boolean n = false;
		
		if( year % 400 == 0) {
			n = true;
		}else if(year % 100 == 0) {
			n = false;
		}else {
			n = false;
		}
		if(n) {
			System.out.println("Year " + year + "is a leap Year");
		}else {
			System.out.println("Year " + year + "is not a leap Year");
		}

	}

}
