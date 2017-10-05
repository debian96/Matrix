import java.util.Scanner;

public class AntiClock_Rotation {
	
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		int r1,c1;
		int m1[][];
		
		
		System.out.println("Enter no of rows in 1st matrix:-");
		r1 = sc.nextInt();
		System.out.println("Enter no of columns in 1st matrix:-");
		c1 = sc.nextInt();
		
		if(r1==c1) {

			m1 = new int[r1][c1];
		
			System.out.println("Enter 1st matrix:-");
			for (int i = 0; i < r1; i++) {
				for (int j = 0; j < c1; j++) {
					m1[i][j] = sc.nextInt();
				}	
			}
			
			System.out.println("Given matrix:-");
			for (int i = 0; i < r1; i++) {
				for (int j = 0; j < c1; j++) {
					System.out.print(m1[i][j]);
					System.out.print(" ");
				}
				System.out.println();
			}

			System.out.println("Anti-Clock wise 90 degree rotation of above matrix is \n");
			
			rotate(m1,r1);
			
			for (int i = 0; i < r1; i++) {
				for (int j = 0; j < c1; j++) {
					System.out.print(m1[i][j]);
					System.out.print(" ");
				}
				System.out.println();
			}
		}else {
			System.out.println("Provide a square matrix");
		}
	}
	private static void rotate(int[][] m, int n) {
		
		int temp;
		int total_levels = n/2;
		int level = 0;
		
		// Consider all squares one by one
		for (int i = level; i <total_levels ; i++) {
			
			// Consider elements in group of 4 in 
	        // current square
			for (int j = level; j <n-i-1 ; j++) {
				
				// store current cell in temp variable
				temp = m[i][j];
				
				// move values from right to top
				m[i][j] = m[j] [n-1-i];
				
				// move values from bottom to right
				m[j] [n-1-i] = m[n-1-i][n-1-j];
				
				// move values from lrft to bottom
				m[n-1-i][n-1-j] = m[n-1-j][i];
				
				// assign temp to left
				m[n-1-j][i] = temp;
				
			}
		}
		
	}
}
