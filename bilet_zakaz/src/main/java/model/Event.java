package model;

import java.time.LocalDate;

public class Event {

    public int idEvent;
    public String titleEvent;
    public LocalDate dateEvent;

    public Event(int nidEvent, String ntitle, String nDate) {

        System.out.println("event ");
        idEvent = nidEvent;
        titleEvent = ntitle;
        dateEvent = nDate;

    }

}

