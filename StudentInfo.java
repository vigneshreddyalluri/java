public class StudentInfo {
    public static void main(String[] args) {
	
	// Ex 1
	/*	String id 	= args[0];
        String name = args[1];
        int marks 	= Integer.valueOf(args[2]);
		String grade = args[3];
        System.out.println("Student Information:");
        System.out.println("Id: " + id);
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
	
	// Ex 2
	System.out.println("Grade: " + grade);*/
	
	// Ex 3
	int a = Integer.valueOf(args[0]);
	int b = Integer.valueOf(args[1]);

	/* Ex 4
	//int c = Integer.valueOf(args[2]);
	if(a>b && a>c)
	{ System.out.println("A is greater than B,C, A= " +a);
	}
	else if(b>a && b>c)
	{ System.out.println("B is greater than A,C, B= " +b);
	}
	else
	{ System.out.println("C is greater than A,B, C= " +c);
	}  */
		
	//Ex 5 Ternary operator 
	int max = (a>b) ? a:b;
	System.out.println("Max value is " +max);
    }
}