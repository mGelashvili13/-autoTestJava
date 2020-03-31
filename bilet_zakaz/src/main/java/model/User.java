package model;

public class User {
    public int id;
    public String name;
    public String phone;

    public User(int nid, String nname, String nphone) {
        System.out.println("user ");
        id = nid;
        name = nname;
        phone = nphone;
    }
}