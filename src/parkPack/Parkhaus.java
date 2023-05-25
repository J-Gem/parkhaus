package parkPack;

import java.util.ArrayList;

class Parkhaus {
    private KassenAutomat myAutomat;
    private int belegteStellenpletze;
    private final int maxStellenPletze = 250;
    private final int mindestParkdauer = 60;
    private ArrayList<Ticket> tickets = new ArrayList<Ticket>();

    Parkhaus() {
    }

    public void erstellKassenAutomat() {
        myAutomat = new KassenAutomat();
    }

    public KassenAutomat getKassenAutomat() {
        return this.myAutomat;
    }

    public int getBelegteStellenpletze() {
        return belegteStellenpletze;
    }

    public ArrayList getTickets() {
        return tickets;
    }

    public void setTickets(ArrayList tickets) {
        this.tickets = tickets;
    }

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
        this.belegteStellenpletze++;

        erstelleTicket();
    }

    public int ausparken(Long id) {
        for (int i = 0; i < tickets.size(); i++) {
            if (tickets.get(i).getId() == id) {
                if (tickets.get(i).isIstBezahlt() == true) {
                    ticketLoschen(i);
                    this.belegteStellenpletze--;
                    return 0;
                } else {
                    return 1;
                }
            }
        }
        return 2;
    }

    public Ticket ticketScannen(long id) {
        for (int i = 0; i < tickets.size(); i++) {
            if (tickets.get(i).getId() == id) {
                return tickets.get(i);
            }
        }
        return null;
    }

    public Ticket erstelleTicket() {
        Ticket Tmp = new Ticket();
        tickets.add(Tmp);
        System.out.println("Ihre Parkplatz Nummer lautet:" + tickets.size() + "  ID:  " + Tmp.getId());
        return Tmp;
    }

    public int getMindestParkdauer() {
        return this.mindestParkdauer;
    }

    public void ticketLoschen(int parkplatzNummer) {
        tickets.remove(parkplatzNummer);
    }
}
