/*Create a class College , College will have List of Courses, College have college name 
and address, Course classes will contain, Course Name, Course ID, No of Students. 
Course will also have list of Students
Student class
Student ID, Name and Age. Print all details of college if we call college*/

import java.util.*;

public class CollegeExam {
	String CollegeName;
	String CollegeAddress;
	List<Integers> courses = new courses ArrayList;

	public CollegeExam() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "CollegeExam [CollegeName=" + CollegeName + ", CollegeAddress=" + CollegeAddress + ", getCollegeName()="
				+ getCollegeName() + ", getCollegeAddress()=" + getCollegeAddress() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

	public String getCollegeName() {
		return CollegeName;
	}

	public void setCollegeName(String collegeName) {
		CollegeName = collegeName;
	}

	public String getCollegeAddress() {
		return CollegeAddress;
	}

	public void setCollegeAddress(String collegeAddress) {
		CollegeAddress = collegeAddress;
	}

	public List<Integers> getCourses() {
		return courses;
	}

	public void setCourses(List<Integers> courses) {
		this.courses = courses;
	}

	public courses getArrayList() {
		return ArrayList;
	}

	public void setArrayList(courses arrayList) {
		ArrayList = arrayList;
	} <>();
	
}
