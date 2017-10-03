import java.util.Scanner;

class Multiplication {

	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		int r1,c1,r2,c2;
		int m1[][], m2[][], m3[][];
		int sum;
		
		System.out.println("Enter no of rows in 1st matrix:-");
		r1 = sc.nextInt();
		System.out.println("Enter no of columns in 1st matrix:-");
		c1 = sc.nextInt();
		System.out.println("Enter no of rows in 2nd matrix:-");
		r2 = sc.nextInt();
		System.out.println("Enter no of columns in 2nd matrix:-");
		c2 = sc.nextInt();
		
		if (c1==r2) {
			
			
			m1 = new int[r1][c1];
			m2 = new int[r2][c2];
			m3 = new int[r1][c2];
		
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
			
			//Multiplication
			for (int i = 0; i < r1; i++) {
				for (int j = 0; j < c2; j++) {
					sum = 0;
					for (int k= 0; k < c1; k++) {
						sum = sum + m1[i][k] * m2[k][j];
					}
					m3[i][j] = sum;		
				}	
			}
			
			
			System.out.println("Result matrix:-");
			for (int i = 0; i < r1; i++) {
				for (int j = 0; j < c2; j++) {
					System.out.print(m3[i][j]);
					System.out.print(" ");
				}
				System.out.println();
			}	
		
		} else {
			System.out.println("Error! column of first matrix not equal to row of second");
		}
		
	}	
}
