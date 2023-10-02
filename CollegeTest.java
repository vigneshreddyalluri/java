
/* Create a class College , College will have List of Courses, College have college name 
and address, Course classes will contain, Course Name, Course ID, No of Students. 
Course will also have list of Students
Student class
Student ID, Name and Age. Print all details of college if we call college*/


/*
class Course { 
	String CourseName = "Computer Science";
	int CourseId = 135;
	String NoOfStudents = "100";
	List<Student> students = new ArrayList<>();	
	void addStudent(Student student) {
    students.add(student);
}
class Student {
	int StudentId = 14567;
	String StudentName = "Vignesh";
	byte StudentAge = 23;
}
class College {
	public static void main(String args [])
	{
	String CollegeName = "University of Bridgeport";
	String CollegeAddress = "123 Park Ave, Bridgeport, CT-06604";
	List<Course> courses = new ArrayList<>();
	{
    courses.add(course);
    System.out.println(College);
	}
}
}

*/
import java.util.*;
class Stud {
  int studentID, age;
  String name;
   Stud(int studentID, String name, int age) {
   this.studentID = studentID;
   this.name = name;
   this.age = age;
   
 }
@Override
public String toString() {
	return "Stud [studentID=" + studentID + ", age=" + age + ", name=" + name + "]";
}
 }
class Course {
     int courseID;
     String courseName;
     List<Stud> students=new ArrayList<>();
     Course(int courseID, String courseName) {
       this.courseID = courseID;
       this.courseName = courseName;
      
    }
//	public void addStudent(Stud student1) {
//		students.add(student1);
//	}
	@Override
	public String toString() {
		return "Course [courseID=" + courseID + ", courseName=" + courseName + ", students=" + students + "]";
	}
}
class CollegeTest {
	 @Override
	public String toString() {
		return "CollegeTest [collegeName=" + collegeName + ", address=" + address + ", courses=" + courses + "]";
	}
	String collegeName;
     String address;
     List<Course> courses = new ArrayList<>();;
      CollegeTest(String collegeName, String address) {
      this.collegeName = collegeName;
      this.address = address;
    }
      public static void main(String[] args) {
    	  Stud student1 = new Stud(134, "Vignesh", 25);
          Stud student2 = new Stud(125, "Teja", 24);
          CollegeTest C1=new CollegeTest("UB","374 cartlon");
      Course course1 = new Course(1, "Computer Science");
      Course course2 = new Course(2, "Electronics");
      course1.students.add(student1);
      course2.students.add(student2);
     C1.courses.add(course1);
     C1.courses.add(course2);
      System.out.println(C1);    
     }
}
