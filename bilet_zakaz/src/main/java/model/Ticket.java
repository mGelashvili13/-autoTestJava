package model;

public class Ticket {
    public int idTicket;
    public int idEventTicket;
    public int idUserTicket;
    public int seat;

    public Ticket(int nidTicket, int nidEventTicket, int nidUserTicket, int nseat){
        System.out.println("ticket ");
        idTicket=nidTicket;
        idEventTicket=nidEventTicket;
        idUserTicket=nidUserTicket;
        seat=nseat;
    }
}