import java.util.ArrayList;
import java.util.List;


public class Student {
    private final String name;
    private final List<Teacher> teachers = new ArrayList<>(); // a student KNOWS many teachers

    public Student(String name) {
        this.name = name;
    }

    // Called by Teacher.addStudent() to complete the two-way link
    void addTeacher(Teacher teacher) {
        teachers.add(teacher);
    }

    public void printTeachers() {
        System.out.print(name + " learns from: ");
        for (Teacher t : teachers) {
            System.out.print(t.getName() + " ");
        }
        System.out.println();
    }

    public String getName() {
        return name;
    }

}
