import java.util.Scanner;

public class DecimalToBinary {

	public static void main(String[] args) {
		
		int Dec ,i = 0;
		int binary [] = new int [100];
		Scanner User = new Scanner (System.in);
		System.out.print("Enter decimal number : ");
		Dec = User.nextInt();
		
		while(Dec != 0) {
			binary[i] = Dec%2;
			Dec /= 2;
			i++;
		}
		System.out.print("Binary value is : ");
		for(int j=i-1; j>=0; j--) {
			System.out.print(""+binary[j]);
		}
	}

}