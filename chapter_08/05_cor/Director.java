public class Director extends Approver {
    public void approveLeave(int days) {
        System.out.println("Director approved " + days + " days leave");
    }
}