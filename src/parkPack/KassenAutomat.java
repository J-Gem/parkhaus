package parkPack;

import java.util.Scanner;

class KassenAutomat {
    Parkhaus myParkhaus;
    private float parkGebuhr;
    private float preis;
    final private String[] munzenName = { "2-Euro", "1-Euro", "50-Cent" };
    final private float[] munzenWert = { 2.00f, 1.00f, 0.50f };
    private int[] munzenAnzahl = { 0, 0, 0 };
    static Scanner myScanner = new Scanner(System.in);

    KassenAutomat() {
    }

    public KassenAutomat(Parkhaus parkhaus) {
        this.myParkhaus = parkhaus;
    }

    public boolean bezahlen(Ticket ticket) {
        preisBerechnen(parkdauerBerechnen(ticket));
        return true;
    }

    public static int parkdauerBerechnen(Ticket ticket) {
        ticket.getDateHelper();
        ticket.getDateHelper();
        return DateHelper.calculateTimeDifferenceInMinutes(ticket.getStartDatum(), DateHelper.getActualTimeAsString());
    }

    public float preisBerechnen(int parkdauer) {
        if (parkdauer <= 60) {
            preis = 2.0f;
        } else {
            preis = 0.5f * (int) ((parkdauer - 60) % 30);
        }
        System.out.println("Preis:" + preis + "€");
        geldeinwerfen(preis);
        return preis;
    }

    public static boolean geldeinwerfen(float preis) {
        int in = myScanner.nextInt();
        return true;
    }
}
