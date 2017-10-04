import java.util.Scanner;

public class Determinant {
	
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		int r1,c1;
		int m1[][];
		
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
			
			int result = determinant(m1,r1);
			System.out.println("Determinant of above matrix is:\t"+result);
			
			
			
		
		} else {
			System.out.println("The given matrix is not square matrix");
		}
			
			
			
				
		
			
	}
	private static  int  determinant(int[][] m1,int n) {
		int result = 0;
		
		 
	    //  Base case : if matrix contains single element
	    if (n == 1)
	        return m1[0][0];
	 
	    int temp[][] = new int[n][n]; // To store cofactors
	 
	    int sign = 1;  // To store sign multiplier
	 
	     // Iterate for each element of first row
	    for (int i = 0; i < n; i++)
	    {
	        // Getting Cofactor of mat[0][i]
	        getCofactor(m1, temp, 0, i, n);
	        result += sign * m1[0][i] * determinant(temp, n - 1);
	 
	        // terms are to be added with alternate sign
	        sign = -sign;
	    }
		
		return result;
		
	}
	private static void getCofactor(int[][] m1, int[][] temp, int p, int q, int n) {
		int i = 0, j = 0;
		 
	    // Looping for each element of the matrix
	    for (int row = 0; row < n; row++)
	    {
	        for (int col = 0; col < n; col++)
	        {
	            //  Copying into temporary matrix only those element
	            //  which are not in given row and column
	            if (row != p && col != q)
	            {
	                temp[i][j++] = m1[row][col];
	 
	                // Row is filled, so increase row index and
	                // reset col index
	                if (j == n - 1)
	                {
	                    j = 0;
	                    i++;
	                }
	            }
	        }
	    }
		
	}	
}
