import java.util.Scanner;

public class DeciToHexa {

	public static void main(String[] args) {
		//decimal to hexadecimal program
		int num,temp,rem,i,j=0;
		char hexa[] = new char[100];
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter any Decimal number : ");
		num = sc.nextInt();
		temp = num;
		while(temp != 0) {
			rem = temp %16;
			if(rem < 10) {
				hexa[j++] = (char)(48 + rem);
			}else {
				hexa[j++] = (char)(55 + rem);
			}
			temp =temp /16;
		}
		System.out.print("Hexadecimal value of :"+num+" = ");
		for(i=j-1; i >=0; i--) {
			System.out.print(hexa[i]);
		}
	}

}
