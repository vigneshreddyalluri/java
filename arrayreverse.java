import java.util.Scanner;
public class arrayreverse {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = s.nextInt();
        int[] array = new int[n];

        System.out.println("Enter numbers to be reversed: ");
        for (int i = 0; i < n; i++) {
            array[i] = s.nextInt();
        }

        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }

        System.out.print("Numbers in reverse order: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
    }
}
