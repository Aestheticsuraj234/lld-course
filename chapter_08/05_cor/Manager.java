public class Manager extends Approver{
     public void approveLeave(int days) {
        if (days <= 5) {
            System.out.println("Manager approved " + days + " days leave");
        } else {
            next.approveLeave(days);
        }
    }
}
