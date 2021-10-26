package pyramidPattern;

public class DiamonPartern {

	public static void main(String[] args) {
		ShowDiamon();
		
	}
	public static void ShowDiamon() {
		int n = 15;
		int i,j,k;
		for( i = 1; i <= n; i++) {
			for(j =i; j < n; j++) {
				System.out.print(" ");
			}
			for(k = 1; k < (i * 2); k++) {
				System.out.print("*");
			}
			System.out.println("\n");
		}
		for(i = n - 1; i >= 1; i--) {
			for( j = n; j > i; j--) {
				System.out.print(" ");
			}
			for(k = 1; k < (i*2); k++) {
				System.out.print("*");
			}
			System.out.println("\n");
		}

	}

}