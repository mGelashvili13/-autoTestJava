package model;

public class User {
    public int id;
    public String name;
    public String phone;

   public void getidUser(){}



    public User(int nid, String nname, String nphone) {
        System.out.println("что-то классное и обязательное: " );
        id=nid;
        name=nname;
        phone=nphone;
    }
}