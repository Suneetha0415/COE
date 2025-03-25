import java.util.*;
class Student {
    private String name;
    private int marks;
    public Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }
    public String getName() {
        return name;
    }

    public int getMarks() {
        return marks;
    }
    public void display() {
        System.out.println(name + " - " + marks);
    }
}
public class StudentSorting {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Alice", 85));
        students.add(new Student("Bob", 90));
        students.add(new Student("Charlie", 78));
        Collections.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                return Integer.compare(s2.getMarks(), s1.getMarks()); 
            }
        });
        System.out.println("Sorted Students (Descending Order of Marks):");
        for (Student student : students) {
            student.display();
        }
    }
}
