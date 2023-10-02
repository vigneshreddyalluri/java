import java.util.*; 
public class Area {
	public static void main (String args[]) {
	int b,h;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Breadth of triangle");
	b = sc.nextInt();
	System.out.println("Enter Heigth of triangle");
	h = sc.nextInt();
	double area = (b*h)/2;
	System.out.println("Area of triangle"+area);
}
}