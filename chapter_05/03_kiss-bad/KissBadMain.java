public class KissBadMain {
    public static void main(String[] args) {
        GradeCalculator calc = new GradeCalculator();
        int[] tests = {95, 80, 60, 30, 120, -5};
        for (int marks : tests) {
            System.out.println(marks + " -> " + calc.grade(marks));
        }
    }
}
