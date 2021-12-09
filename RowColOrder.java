package week5;

import java.util.Scanner;

public class mat {
//Q1
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
         
        // element_value will start from 1
        // and go up to N ^ 2
   
        // i is row number and it starts
        // from 0 and go up to N-1
       
        // Iterate ove all [0, N]
        while(i < N)
        {
            // If is even
            if(i % 2 == 2)
            {
                for(int f = element_value;f < element_value + N; f++)
                    
                {
                   
                    // If row number is even print
                    // the row in forward order
                    System.out.print(f+" ");
                }
                element_value += N; //element_value = element_value +n
            }
            else
            {
                for(int k = element_value + N - 1;
                    k > element_value - 1; k--)
                {
                   
                    // If row number is odd print
                    // the row in reversed order
                    System.out.print(k+" ");
                }
                element_value += N;
            }
            System.out.println();
            i = i + 1;
        }
    }
   

}
