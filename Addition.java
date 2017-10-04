import java.util.Scanner;

public class Addition {

	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		int r1,c1,r2,c2;
		int m1[][], m2[][], m3[][];
		
		System.out.println("Enter no of rows in 1st matrix:-");
		r1 = sc.nextInt();
		System.out.println("Enter no of columns in 1st matrix:-");
		c1 = sc.nextInt();
		System.out.println("Enter no of rows in 2nd matrix:-");
		r2 = sc.nextInt();
		System.out.println("Enter no of columns in 2nd matrix:-");
		c2 = sc.nextInt();
		
		if (r1==r2 && c1==c2) {
			
			
			m1 = new int[r1][c1];
			m2 = new int[r2][c2];
			m3 = new int[r1][c1];
		
			System.out.println("Enter 1st matrix:-");
			for (int i = 0; i < r1; i++) {
				for (int j = 0; j < c1; j++) {
					m1[i][j] = sc.nextInt();
				}	
			}
			
			System.out.println("Enter 2nd matrix:-");
			for (int i = 0; i < r2; i++) {
				for (int j = 0; j < c2; j++) {
					m2[i][j] = sc.nextInt();
				}	
			}
			
			//Adition
			for (int i = 0; i < r1; i++) {
				for (int j = 0; j < c1; j++) {
					m3[i][j] = m1[i][j]+m2[i][j];
				}	
			}
			
			
			System.out.println("Result matrix:-");
			for (int i = 0; i < r1; i++) {
				for (int j = 0; j < c1; j++) {
					System.out.print(m3[i][j]);
					System.out.print(" ");
				}
				System.out.println();
			}	
		
		} else {
			System.out.println("Order of matrix did not matched!!");
		}
		
	}	
}
