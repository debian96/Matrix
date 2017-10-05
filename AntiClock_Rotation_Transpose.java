import java.util.Scanner;

public class AntiClock_Rotation_Transpose {
	
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
			
			
			//Transpose
			
			for (int i = 0; i < r1; i++) {
	             for (int j = i+1; j < c1; j++) {
	                 int temp=m1[i][j];
	                 m1[i][j]=m1[j][i];
	                 m1[j][i]=temp;
	             }
	         }
			
			//reverse every column
			
			for (int j = 0; j < c1; j++) {
	             for (int i = 0; i <(r1/2); i++) {
	                 int temp=m1[i][j];
	                 m1[i][j]=m1[r1-1-i][j];
	                 m1[r1-1-i][j]=temp;
	             }
	         }
			
			
			
			System.out.println("AntiClock wise 90 degree rotation of above matrix is \n");
			
			
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
}
