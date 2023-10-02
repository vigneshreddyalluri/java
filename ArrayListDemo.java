import java.util.*;
public class ArrayListDemo {
	public static void main(String args[])
	{
		ArrayList<Integer> al1 = new ArrayList<>(20);
		ArrayList<Integer> al2 = new ArrayList<>(List.of(50, 60, 70, 80, 90));
		al1.add(10);
		al1.add(0, 5);
		al1.addAll(1, al2);
		al1.add(5, 70);
		al1.set(6, 100);
		
		for(int i=0; i < al1.size(); i++)
		{
			System.out.println(al1.get(i));
		}
		System.out.println(al1.contains(5));
		System.out.println(al1);
		
		for(Integer x: al1) 
		{
			System.out.println(x);
		}
		
		al1.forEach(n -> show(n));
 	}
	static void show(int n)
	{  if(n>60)
		System.out.println(n);
	}
}
