public class ArraySum {
	public static void main(String args[])
	{
		int a[] = {1,2,4,5,6,7,8,9,10};
		int sum = 0;
		for(int i: a)
		{
			sum = sum + i;
		}System.out.println(sum);
	}
}
