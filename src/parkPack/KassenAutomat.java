package parkPack;

import java.util.Scanner;

class KassenAutomat {
    Parkhaus myParkhaus;
    private float preis;
    final private static String[] munzenName = { "2-Euro", "1-Euro", "50-Cent" };
    final private static float[] munzenWert = { 2.00f, 1.00f, 0.50f };
    static Scanner myScanner = new Scanner(System.in);

    KassenAutomat() {
    }

    public boolean bezahlen(Ticket ticket) {
        geldeinwerfen(preisBerechnen(parkdauerBerechnen(ticket)));
        return true;
    }

    public static int parkdauerBerechnen(Ticket ticket) {
        ticket.getDateHelper();
        ticket.getDateHelper();
        return DateHelper.calculateTimeDifferenceInMinutes(ticket.getStartDatum(), DateHelper.getActualTimeAsString());
    }

    public float preisBerechnen(int parkdauer) {
        System.out.println(parkdauer + "min");
        if (parkdauer <= 60) {
            preis = 2.0f;
        } else {
            preis = (0.5f * (int) ((parkdauer - 60) / 30)) + 2.0f;
        }
        System.out.println("Preis:" + preis + "€");
        return preis;
    }

    public static boolean geldeinwerfen(float preis) {
        float in = myScanner.nextFloat();
        System.out.println("\nIhr Rest:");
        if (in >= preis) {
            in = in - preis;
            for (int i = 0; i < 3; i++) {
                System.out.println(munzenName[i] + "*" + (int) (float) Math.floor(in / munzenWert[i]));
                in = Math.round((in % munzenWert[i]) * 100.00) / 100.0f;
            }
        } else {
            System.out.println("Bitte erneut bezahlen! Bezahlter Betrag zu Niedrig.");
        }

        return true;
    }

}
