package app;

public class User implements IUser {
    
    public User() {}
    
    @Override
    public void NewTicket() {
        System.out.print("New Ticke");
    }
    
    @Override
    public void CancelTicket() {
        System.out.print("Cancel Ticket");
    }

    @Override
    public void displayTicket() {
        System.out.print("display Ticket");
    }
}
