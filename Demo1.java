import java.util.Scanner;
class Demo1
{
public static void main(String[] args)
{
Scanner scanner = new Scanner(System.in);

System.out.println("Enter A value: ");
int a = scanner.nextInt();

System.out.println("Enter B value: ");
int b = scanner.nextInt();

int sum = a + b; 
System.out.println("Sum of two number a & b: " + sum);
}
} 

