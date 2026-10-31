public class Main {
    public static void main(String[] args) {
        // Both are created on their own. Neither owns the other.
        Teacher sharma = new Teacher("Sharma");
        Teacher gupta = new Teacher("Gupta");
        Student riya = new Student("Riya");
        Student aman = new Student("Aman");

        sharma.addStudent(riya);
        sharma.addStudent(aman);
        gupta.addStudent(riya);

        sharma.printStudents();
        gupta.printStudents();
        riya.printTeachers();
        aman.printTeachers();
    }
}