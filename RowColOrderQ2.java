package week5;

import java.util.Scanner;

public class mat1 {

	public static void main(String[] args) {
		// Given matrix size
        int N ;
        System.out.print("Enter of size matrix : ");
        Scanner in = new Scanner (System.in);
        N = in.nextInt();
        // Function call
        theMatrix(N);
	}
	public static void theMatrix(int N)
    {
        int element_value = 1;
        int i = 0;
         
        
        while(i < N)
        {
            // If is not == 2
            if(i % 2 == 0)
            {
                for(int f = element_value;
                    f < element_value + N; f++)
                {
                   
                    
                    System.out.print(f+" ");
                }
                element_value += N;
            }
            else
            {
                for(int k = element_value + N - 1;
                    k > element_value -1; k--)
                {
                    System.out.print(k+" ");
                }
                element_value += N;
            }
            System.out.println();
            i = i + 1;
        }
    }
   

}
