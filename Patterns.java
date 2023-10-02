public class Patterns {
public static void main(String args[])
{/*
	System.out.println("    *     ");
	System.out.println("  *   *   ");
	System.out.println(" *     *  ");
	System.out.println("*       * ");
	System.out.println(" *     *  ");
	System.out.println("  *   *   ");
	System.out.println("    *     ");
	System.out.println("    *     ");
	System.out.println("    *  ");
	System.out.println("    *  ");
	System.out.println("********* ");
	System.out.println("    *  ");
	System.out.println("    * ");
	System.out.println("    * ");
	System.out.println("************");
	System.out.println("*    *     *");
	System.out.println("*    *     *");
	System.out.println("*    *     *");
	System.out.println("*    *     *");
	System.out.println("*    *     *");
	System.out.println("************");
*/ 
	/*
	        int size = 7; // Size of the pattern

	        // Pattern 1
	        for (int i = 0; i < size; i++) {
	            for (int j = 0; j < size - i; j++) {
	                System.out.print(" ");
	            }
	            for (int j = 0; j <= i; j++) {
	                System.out.print("* ");
	            }
	            System.out.println();
	        }

	        // Pattern 2
	        for (int i = 0; i < size - 3; i++) {
	            System.out.println("    *");
	        }

	        // Pattern 3
	        for (int i = 0; i < size; i++) {
	            System.out.print("*");
	        }
	        System.out.println();

	        // Pattern 4
	        for (int i = 0; i < size - 1; i++) {
	            System.out.println("*");
	        }

	        // Pattern 5
	        for (int i = 0; i < size; i++) {
	            System.out.print("*");
	        }
	        System.out.println();

	        // Pattern 6
	        for (int i = 0; i < size - 3; i++) {
	            System.out.println("    *");
	        }

	        // Pattern 7
	        for (int i = 0; i < size; i++) {
	            for (int j = 0; j <= i; j++) {
	                System.out.print(" ");
	            }
	            for (int j = 0; j < size - i; j++) {
	                System.out.print("* ");
	            }
	            System.out.println();
	        }


*/
	 int size = 7; // Size of the pattern
     for (int i = 0; i < size; i++) {
         for (int j = 0; j < size - i; j++) {
             System.out.print(" ");
         }
         System.out.print("*");
         if (i > 0) {
             for (int j = 0; j < 2 * i - 1; j++) {
                 System.out.print(" ");
             }
             System.out.print("*");
         }
         System.out.println();
     }

     for (int i = size - 2; i >= 0; i--) {
         for (int j = 0; j < size - i; j++) {
             System.out.print(" ");
         }
         System.out.print("*");
         if (i > 0) {
             for (int j = 0; j < 2 * i - 1; j++) {
                 System.out.print(" ");
             }
             System.out.print("*");
         }
         System.out.println();
     }
}
}
