import java.util.Scanner;


/*Identity matrix is a square matrix with 1’s along the diagonal from upper left to lower
right and 0’s in all other positions. If it satisfies the structure as explained before
then the matrix is called as identity /unit matrix.*/


public class IdentityMatrix {

	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		int r1,c1;
		int m1[][];
		int flag = 0;
		
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
			
			System.out.println("Given matrix:-");
			for (int i = 0; i < r1; i++) {
				for (int j = 0; j < c1; j++) {
					System.out.print(m1[i][j]);
					System.out.print(" ");
				}
				System.out.println();
			}	
		
			
			
			for (int j = 0; j < c1; j++) {
				for (int i = 0; i < r1; i++) {
					if (i==j && m1[i][j]!=1) {
						flag = 1;
						break;
					}else if(m1[i][j]!=0) {
						flag = 1;
						break;
					}
				}
			}	
			
			if (flag==0) {
				System.out.println("Above matrix is Identity Matrix");
			}else {
				System.out.println("Above matrix is not Identity Matrix");
			}
			
		}else {
			System.out.println("Matrix should be square matrix!!!");
		}
			
	}	
}
