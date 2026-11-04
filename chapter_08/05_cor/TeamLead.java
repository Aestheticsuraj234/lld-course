public class TeamLead extends Approver{
     public void approveLeave(int days) {
        if (days <= 2) {
            System.out.println("Team Lead approved " + days + " days leave");
        } else {
            next.approveLeave(days);   // too many days, pass it up
        }
    }
}
