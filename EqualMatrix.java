import java.util.Scanner;



class EqualMatrix {

	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		int r1,c1,r2,c2;
		int m1[][], m2[][];
		int flag = 0;
		
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
			
			//Compared
			for (int i = 0; i < r1; i++) {
				for (int j = 0; j < c1; j++) {
					if (m1[i][j]!=m2[i][j]) {
						flag =1;
						break;
					} 
				}	
			}
			
			
			System.out.println("1st matrix:-");
			for (int i = 0; i < r1; i++) {
				for (int j = 0; j < c1; j++) {
					System.out.print(m1[i][j]);
					System.out.print(" ");
				}
				System.out.println();
			}
			
			System.out.println("2nd matrix:-");
			for (int i = 0; i < r2; i++) {
				for (int j = 0; j < c2; j++) {
					System.out.print(m2[i][j]);
					System.out.print(" ");
				}
				System.out.println();
			}
			
			if (flag == 1) {
				System.out.println("Matrix are not equal...");
			}else {
				System.out.println("Matrix are  equal...");
			}
		
		} else {
			System.out.println("Matrix can not be compared!!");
		}
		
	}	
}
