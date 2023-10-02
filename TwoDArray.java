import java.util.Scanner;

public class TwoDArray {

public static void main(String[] args) {

/*

1 2 3
4 5 6
7 8 9


//int[] - 1 dimentional


int[][] array2D = new int[3][3]; // first - row; second - column


System.out.println("Enter values for 3*3 matrix");
// array2D[0][0] = 1;
// array2D[0][1] = 2;
// array2D[0][2] = 3;
//
// array2D[1][0] = 4;
// array2D[1][1] = 5;
// array2D[1][2] = 6;
//
// array2D[2][0] = 7;
// array2D[2][1] = 8;
// array2D[2][2] = 9;
Scanner s = new Scanner(System.in);
for(int i =0; i < array2D.length; i++) {
for( int j=0; j < array2D[i].length; j++) {
array2D[i][j] = s.nextInt();
}
}
for(int i =0; i < array2D.length; i++) {
for( int j=0; j < array2D[i].length; j++) {

System.out.print(array2D[i][j] + " " ); //

}
System.out.println();
}
*/
	/* int [][] array = new int[2][2];
	System.out.println("Enter values for 2x2 matrix");
	Scanner s = new Scanner(System.in);
	for(int i=0; i< array.length; i++) {
		for(int j=0;j<array[i].length;j++) {
			array[i][j] = s.nextInt();
		}
	}
		for(int i=0; i<array.length; i++) {
			for(int j=0;j<array[i].length; j++)
			{
				System.out.print(array[i][j] +" ");
			}
			System.out.println();
		}
	int [][] array1 = new int[2][2];	
	System.out.println("Enter values for 2x2 2-matrix");
	Scanner s1 = new Scanner(System.in);
	for(int a=0; a< array1.length; a++) {
		for(int b=0;b<array1[a].length;b++) {
			array1[a][b] = s1.nextInt();
		}
	}
		for(int a=0; a<array1.length; a++) {
			for(int b=0;b<array1[a].length; b++)
			{
				System.out.print(array1[a][b] +" ");
			}
			System.out.println();		
		}*/ //--------Addition of 2 matrixes ;
	Scanner s = new Scanner(System.in);
	System.out.println("Enter number of rows: ");
	int rows = s.nextInt();
	System.out.println("Enter number of Columns: ");
	int cols = s.nextInt();
	int array[][] = new int [rows][cols];
	int array1[][] = new int [rows][cols];
	System.out.println("Enter values of 1st matrix: ");
	for(int i=0;i<array.length;i++) {
		for(int j=0;j<array.length;j++) {
			array[i][j] = s.nextInt();
			System.out.print(array[i][j] +" ");
		}	System.out.println();
	}
	System.out.println("Enter values of 2nd matrix: ");
	for(int i=0;i<array1.length;i++)
	{
		for(int j=0;j<array1.length;j++) {
			array1[i][j]= s.nextInt();
			System.out.print(array1[i][j] + " ");
		}System.out.println();
	}
	System.out.println("Addition of two matrices are:");
	int[][] result = new int[rows][cols];
	for(int i=0;i<rows; i++) {
		for(int j=0; j<cols; j++) {
			result[i][j] = array[i][j] + array1[i][j];	
			System.out.print(result[i][j] +" ");
		}System.out.println();
	}
	
}
}