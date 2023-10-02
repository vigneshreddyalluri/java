
import java.util.Scanner;
public class Table {
	public static void main(String args[]) {
		System.out.println("Enter any number to get Multiplication Table");
		Scanner s = new Scanner(System.in);
		int j=s.nextInt();	
		for(int i=1;i<=10;i++)
		{
			System.out.println(j+" * "+i+" = "+j*i);
		}
	}

}
