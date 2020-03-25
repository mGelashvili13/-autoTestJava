package model;

public enum Command {
    Exit(0), CreateUser(1), CreateEvent(2), CreateTicket(3);

    public final int id;

    Command(int nId) {
        id = nId;
    }
    public int getIdCommand() { return id; }
}

//public enum Colors {
//    RED(0), GREEN(1), BLUE(2);
//
//    //RED, GREEN, BLUE;
//
//    private int id;
//
//    Colors(int nId) {
//        id = nId;
//    }
//
//    public int GetSome() { return id; }
//}
//
//public class A {
//    public void DoSome() {
//        int a = Colors.RED.GetSome();
//        int b = Colors.BLUE.GetSome();
//    }
//}
//
//public class ColorsClass {
//    public static ColorsClass RED = new ColorsClass(0);
//    public static ColorsClass GREEN = new ColorsClass(1);
//
//    private int id;
//
//    ColorsClass(int nId) {
//        id = nId;
//    }
//
//    public int GetSome() { return id; }
//}