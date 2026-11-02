public class GradeCalculator {
    public String grade(int marks) {
        if (marks < 0 || marks > 100) return "Invalid";
        if (marks >= 90) return "A";
        if (marks >= 75) return "B";
        if (marks >= 50) return "C";
        return "F";
    }
}
