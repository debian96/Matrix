import java.util.Scanner;


//The transpose of a given matrix is formed by interchanging the rows and columns of a matrix.
public class Transpose {

	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		int r1,c1;
		int m1[][];
		
		System.out.println("Enter no of rows in 1st matrix:-");
		r1 = sc.nextInt();
		System.out.println("Enter no of columns in 1st matrix:-");
		c1 = sc.nextInt();
		
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
		
			
			
			System.out.println("Transpose matrix:-");
			for (int j = 0; j < c1; j++) {
				for (int i = 0; i < r1; i++) {
					System.out.print(m1[i][j]);
					System.out.print(" ");
				}
				System.out.println();
			}	
		
			
	}	
}
