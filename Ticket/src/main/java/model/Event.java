package model;


import java.util.Date;

public class Event {
    public int idEvent;
    public String titleEvent;
    public Date dateEvent;

    public Event(int nidEvent, String ntitle) { //Date ndate
        System.out.println("event ");
        idEvent = nidEvent;
        titleEvent = ntitle;
        //dateEvent = ndate;
    }

}
