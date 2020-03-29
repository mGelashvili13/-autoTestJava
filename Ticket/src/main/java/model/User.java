package model;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

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

    List<User>newUsers=new List<User>() {

    };
    
}