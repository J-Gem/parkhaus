package parkPack;

class Parkhaus {
    private int belegteStellenpletze;
    private final int maxStellenPletze = 250;
    private final int mindestParkdauer = 60;
    private Ticket[] tickets = new Ticket[250];

    Parkhaus() {
    }

    public int getBelegteStellenpletze() {
        return belegteStellenpletze;
    }

    public Ticket[] getTickets() {
        return tickets;
    }

    public void setTickets(Ticket[] tickets) {
        this.tickets = tickets;
    } // Nicht umbedingt Notwendig evntuell entfernen!

    public void setBelegteStellenpletze(int belegteStellenpletze) {
        this.belegteStellenpletze = belegteStellenpletze;
    }

    public boolean platzFrei() {
        if (belegteStellenpletze < maxStellenPletze) {
            return true;
        } else {
            return false;
        }
    }

    public void einParken() {
        erstelleTicket();
    }

    public void ausparken(Ticket ticket) {

    }

    public boolean ticketScannen(Ticket ticket) {

        return true;
    }

    public Ticket erstelleTicket() {
        Ticket Tmp = new Ticket();
        tickets[tickets.length] = Tmp;
        return Tmp;
    }

}
