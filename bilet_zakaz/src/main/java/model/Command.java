package model;
public enum Command {
    Exit(0), CreateUser(1), CreateEvent(2), CreateTicket(3), DeletEvent(4), Reminder(5);

    public final int id;

    Command(int nId) {
        id = nId;
    }
    public int getIdCommand() { return id; }
}