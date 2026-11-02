public class GradeCalculator {
    public String grade(int marks) {
        String result;
        if (marks >= 0) {
            if (marks <= 100) {
                if (marks >= 90) {
                    result = "A";
                } else {
                    if (marks >= 75) {
                        result = "B";
                    } else {
                        if (marks >= 50) {
                            result = "C";
                        } else {
                            result = "F";
                        }
                    }
                }
            } else {
                result = "Invalid";
            }
        } else {
            result = "Invalid";
        }
        return result;
    }
}
