public abstract  class Approver {
    protected Approver next;   // the person to pass the request to

    public void setNext(Approver next) {
        this.next = next;
    }

    public abstract void approveLeave(int days);
}
