import java.util.Scanner;
public class ArrayAddition {
public static void main(String args[])
{	Scanner s = new Scanner(System.in);
	System.out.println("Enter number of elements in an array A: ");
	int a = s.nextInt();
	int ar1[] = new int[a];
	System.out.println("Enter elements in an array A: ");
	for(int i=0; i<a; i++)
	{
		ar1[i] = s.nextInt();
	}
	System.out.println("Enter number of elements in an array B: ");
	int b = s.nextInt();
	int ar2[] = new int[b];
	System.out.println("Enter elements in an array B: ");
	for(int i = 0; i< b; i++) {
		ar2[i] = s.nextInt();
	}
	if(a!=b) {
		System.out.println("Arrays size must be same for addition");
		}
	else {
		int [] sum = new int [a];
		for(int i = 0; i<a; i++ ) {
			sum[i] = ar1[i] + ar2[i];
		}
		System.out.print("Sum of arrays : {");
		for(int i = 0; i<a; i++) {
			System.out.print(sum[i]+" ");
			
		}
		System.out.print("}");
	}
}
}