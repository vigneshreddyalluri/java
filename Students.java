import java.util.*;
import java.util.HashSet;
public class Students{

//public class Students implements Comparable<Students> {
 //---------------------------------------------------
	private int id; 
	private String name;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	

	public Students(int id, String name) {
		this.id = id;
		this.name = name;
	}
	public static void main(String args[])
	{
		Students s1 = new Students(1, "Vignesh");
		Students s2 = new Students(2, "teja");
		Students s3 = new Students(4, "Nandya");
		Students s4 = new Students(9, "abthab");
		Students s5 = new Students(7, "sravya");
		ArrayList <Students> Std = new ArrayList<>();
		Std.add(s1);
		Std.add(s2);
		Std.add(s4);
		Std.add(s3);
		Std.add(s5);
		System.out.println(Std);
		Std.remove(s1);
		System.out.println(Std);
		for (Students student : Std) {
            if (student.getId() == 9) {
                System.out.println("Student Found: " + student);
            }
        	 System.out.println("Student not Found: ");
        	}
	
		}
	@Override
	public String toString() {
		return "Students [id=" + id + ", name=" + name + "]";
	}
	
	
	
	//-----------------------------------------------------------------------------------------

/*
	private int id; 
	private String name;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	

	public Students(int id, String name) {
		this.id = id;
		this.name = name;
	}
	public static void main(String args[])
	{
		Students s1 = new Students(1, "Vignesh");
		Students s2 = new Students(2, "teja");
		Students s3 = new Students(4, "Nandya");
		Students s4 = new Students(9, "abthab");
		Students s5 = new Students(7, "sravya");
		LinkedList <Students> Std = new LinkedList<>();
		Std.add(s1);
		Std.add(s2);
		Std.add(s4);
		Std.add(s3);
		Std.add(s5);
		System.out.println(Std);
		Std.remove(s1);
		System.out.println(Std);
		for (Students student : Std) {
            if (student.getId() == 9) {
                System.out.println("Student Found: " + student);
                
            }
        	// System.out.println("Student not Found: ");
        	}
	
		}
	@Override
	public String toString() {
		return "Students [id=" + id + ", name=" + name + "]";
	}
	*/
	
	//---------------------------------------------------------------------------------------------

/*	private int id; 
	private String name;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	

	public Students(int id, String name) {
		this.id = id;
		this.name = name;
	}
	public static void main(String args[])
	{
		Students s1 = new Students(1, "Vignesh");
		Students s2 = new Students(2, "teja");
		Students s3 = new Students(4, "Nandya");
		Students s4 = new Students(9, "abthab");
		Students s5 = new Students(7, "sravya");
		HashSet<Students> Std = new HashSet<>();
		Std.add(s1);
		Std.add(s2);
		Std.add(s4);
		Std.add(s3);
		Std.add(s5);
		System.out.println(Std);
		Std.remove(s1);
		System.out.println(Std);
		for (Students student : Std) {
            if (student.getId() == 9) {
                System.out.println("Student Found: " + student);
                
            }
        	// System.out.println("Student not Found: ");
        	}
	
		}
	@Override
	public String toString() {
		return "Students [id=" + id + ", name=" + name + "]";
	
	}
	
	*/
	//------------------------------------------------------------------------------------------
	/*
	private int id; 
	private String name;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	

	public Students(int id, String name) {
		this.id = id;
		this.name = name;
	}
	public static void main(String args[])
	{
		Students s1 = new Students(1, "Vignesh");
		Students s2 = new Students(2, "teja");
		Students s3 = new Students(4, "Nandya");
		Students s4 = new Students(9, "abthab");
		Students s5 = new Students(7, "sravya");
		LinkedHashSet<Students> Std = new LinkedHashSet<>();
		Std.add(s1);
		Std.add(s2);
		Std.add(s4);
		Std.add(s3);
		Std.add(s5);
		System.out.println(Std);
		Std.remove(s1);
		System.out.println(Std);
		for (Students student : Std) {
            if (student.getId() == 9) {
                System.out.println("Student Found: " + student);
                
            }
        	// System.out.println("Student not Found: ");
        	}
	
		}
	@Override
	public String toString() {
		return "Students [id=" + id + ", name=" + name + "]";
	
	}
	
	*/
	//----------------------------------------------------------------------
	
	/*
	private String name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Students(int id, String name) {
		this.id = id;
		this.name = name;
	}
	public static void main(String args[])
	{
		Students s1 = new Students(1, "Vignesh");
		Students s2 = new Students(2, "teja");
		Students s3 = new Students(4, "Nandya");
		Students s4 = new Students(9, "abthab");
		Students s5 = new Students(7, "sravya");
		TreeSet<Students> Std = new TreeSet<>();
		
		Std.add(s1);
		Std.add(s2);
		Std.add(s4);
		Std.add(s3);
		Std.add(s5);
		System.out.println(Std);
		Std.remove(s1);
		System.out.println(Std);
		for (Students student : Std) {
            if (student.getId() == 9) {
                System.out.println("Student Found: " + student);
                
            }
        	// System.out.println("Student not Found: ");
        	}
		}
	@Override
	public String toString() {
		return "Students [id=" + id + ", name=" + name + "]";
	}
	public int compareTo(Students s) {
		return Integer.compare(this.id, s.id);
	}
	
	*/
//-----------------------------------------------------------------
	/*private int id; 
	private String name;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	

	public Students(int id, String name) {
		this.id = id;
		this.name = name;
	}
	public static void main(String args[])
	{
		Students s1 = new Students(1, "Vignesh");
		Students s2 = new Students(2, "teja");
		Students s3 = new Students(4, "Nandya");
		Students s4 = new Students(9, "abthab");
		Students s5 = new Students(7, "sravya");
		HashMap<Integer, Students> Std = new HashMap<>();
		Std.put(s1.getId(), s1);
		Std.put(s2.getId(), s2);
		Std.put(s4.getId(), s4);
		Std.put(s3.getId(), s3);
		Std.put(s5.getId(), s5);
		System.out.println(Std);
		Std.remove(s1);
		System.out.println(Std);
		for (Students student : Std.values()) {
            if (student.getId() == 9) {
                System.out.println("Student Found: " + student);
                
            }
        	// System.out.println("Student not Found: ");
        	}
	
		}
	@Override
	public String toString() {
		return "Students [id=" + id + ", name=" + name + "]";
	
	}
	*/
}
