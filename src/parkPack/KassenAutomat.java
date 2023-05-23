package parkPack;

class KassenAutomat {
    Parkhaus myParkhaus;
    private float parkGebuhr;
    private float preis;
    final private String[] munzenName = { "2-Euro", "1-Euro", "50-Cent" };
    final private float[] munzenWert = { 2.00f, 1.00f, 0.50f };
    private int[] munzenAnzahl = { 0, 0, 0 };

    KassenAutomat(Parkhaus myParkhaus) {
        this.myParkhaus = myParkhaus;
    }

    public boolean bezahlen() {
        return true;
    }

    public int parkdauerBerechnen(Ticket ticket) {

        return 4;
    }

    public float preisBerechnen(int parkdauer) {
        // Preis ausgabe
        return 4.0f;
    }

    public boolean geldeinwerfen() {
        // Eingabe
        return true;
    }
}
