public class Main {
    public static void main(String[] args) {
        Approver lead = new TeamLead();
        Approver manager = new Manager();
        Approver director = new Director();
        
        lead.setNext(manager);
        manager.setNext(director);
        
        lead.approveLeave(2);
        lead.approveLeave(4);
        lead.approveLeave(10);
    }
}

// Team lead approve 2 days leave
// Manager approved 4 days leave
// Director approved 10 days leave