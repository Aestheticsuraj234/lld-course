import java.util.ArrayList;
import java.util.List;


public class Teacher {
    private final String name;
    private final List<Student> students = new ArrayList<>(); // a teacher KNOWS many student

    public Teacher(String name) {
        this.name = name;
    }


    // The student is created OUTSIDE and just linked here
    public void addStudent(Student student) {
        students.add(student);
        student.addTeacher(this); // two-way link: the student also knows this teacher
    }

    public void printStudents() {
        System.out.print(name + " teaches: ");
        for (Student s : students) {
            System.out.print(s.getName() + " ");
        }
        System.out.println();
    }

    public String getName() {
        return name;
    }
}
