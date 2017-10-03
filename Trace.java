import java.util.Scanner;


//The trace of the square matrix is the sum of the main diagonal
 class Trace {

	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		int r1,c1;
		int m1[][];
		int trace = 0;
		
		System.out.println("Enter no of rows in 1st matrix:-");
		r1 = sc.nextInt();
		System.out.println("Enter no of columns in 1st matrix:-");
		c1 = sc.nextInt();
		
		if (r1==c1) {
			
			
			m1 = new int[r1][c1];
		
			System.out.println("Enter 1st matrix:-");
			for (int i = 0; i < r1; i++) {
				for (int j = 0; j < c1; j++) {
					m1[i][j] = sc.nextInt();
				}	
			}
			
			
			//Trace
			for (int i = 0; i < r1; i++) {
				for (int j = 0; j < c1; j++) {
					if (i==j) {
						trace = trace +m1[i][j];
					}	
				}	
			}
			
			
			System.out.println("Result matrix:-");
			for (int i = 0; i < r1; i++) {
				for (int j = 0; j < c1; j++) {
					System.out.print(m1[i][j]);
					System.out.print(" ");
				}
				System.out.println();
			}	
		
			System.out.println("Trace of above matrix is:-- "+trace);
			
		} else {
			System.out.println("The matrix should be a square matrix!!");
		}
		
	}	
}
