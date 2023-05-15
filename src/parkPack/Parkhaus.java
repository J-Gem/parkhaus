package parkPack;

import java.util.ArrayList;

class Parkhaus {
    private int belegteStellenpletze;
    final int maxStellenPletze = 250;
    final int mindestParkdauer = 60;
    private ArrayList<Ticket> tickets = new ArrayList<Ticket>();

    Parkhaus() {
    }

    public int getBelegteStellenpletze() {
        return belegteStellenpletze;
    }

    public ArrayList<Ticket> getTickets() {
        return tickets;
    }

    public void setBelegteStellenpletze(int belegteStellenpletze) {
        this.belegteStellenpletze = belegteStellenpletze;
    }

    public void setTickets(ArrayList<Ticket> tickets) {
        this.tickets = tickets;
    }

    public boolean platzFrei() {

        return true;
    }

    public void einParken() {

    }

    public void ausparken(Ticket ticket) {

    }

    public boolean ticketScannen(Ticket ticket) {

        return true;
    }

    public Ticket erstelleTicket(){
        return new Ticket();
    }

}
