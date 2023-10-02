import java.util.*;
public class ListDuplicates {
public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	ArrayList<Integer> al = new ArrayList<>();
	System.out.println("Enter size of an elements in an Array ");
	int noe = sc.nextInt();
	System.out.println("Enter "+noe+" integers in an array ");
	for(int i=0; i<noe; i++)
	{
		int arry = sc.nextInt();
		al.add(arry);
	}
	System.out.println("Numbers in array: "+al);
	Set<Integer> ts = new TreeSet<>(al);
	System.out.println("Without Duplicates "+ts);
}
}
