class Student {
    int[] marks;
    public Student(int[] marks) {
        this.marks = marks;
    }
    public int getTotalMarks() {
        int total = 0;
        for (int i = 0; i < marks.length; i++) {
            total += marks[i];
        }
        return total;
    }
}
public class ArrayDemo {
    public static void main(String[] args) {
        int[] marks = { 85, 90, 78, 92, 88, 95 };
        Student student = new Student(marks);
        System.out.println("Total Marks: " + student.getTotalMarks());
    }
}
