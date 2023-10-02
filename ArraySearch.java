import java.util.*;
public class ArraySearch {
	public static void  main(String args[])
	{
		Scanner s = new Scanner(System.in);
		int a[] = {1,2,3,4,5,6,7,8,9,10};
		System.out.println("Enter a key to search");
		int key = s.nextInt();
		for(int i = 0; i<a.length; i++)
		{
			if(key == a[i])
			{
				System.out.println("Key is found"+i);
				System.exit(0);
			}
		
		}System.out.println("Not found");
	}
}
