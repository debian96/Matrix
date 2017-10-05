import java.util.Scanner;

public class SpiralOrder {
	
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		int r1,c1;
		int m1[][];
		int trace = 0;
		
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

			System.out.println("Spiral order of above matrix is \n");
			spiralorder(m1,r1,c1);
		
			
	}
	private static void spiralorder(int[][] m1, int r1, int c1) {
		int top_row = 0,
			bottom_row = r1-1,
			left_column = 0,
			right_column = c1-1;
		
		/*
		 * direction = 0  left->right
		direction = 1  top->bottom
		direction = 2  right->left
		direction = 3  bottom->top
		*/
				
		int direction = 0;
		
		while(top_row<=bottom_row && left_column<=right_column) {
			
			if(direction==0) {
				
				for (int i = left_column; i <= right_column; i++) {
					System.out.print(m1[top_row][i]+" ");
				}
				top_row++;
				direction = 1;
			}else if(direction==1) {
				
				for (int i = top_row; i <= bottom_row; i++) {
					System.out.print(m1[i][right_column]+" ");
				}
				right_column--;
				direction = 2;
			}else if(direction==2) {
				
				for (int i = right_column; i >= left_column; i--) {
					System.out.print(m1[bottom_row][i]+" ");
				}
				bottom_row--;
				direction = 3;
			}else if(direction==3) {
				for (int i = bottom_row; i >= top_row; i--) {
					System.out.print(m1[i][left_column]+" ");
				}
				left_column++;
				direction = 0;
				
			}
		}
		
		
	}	
}
