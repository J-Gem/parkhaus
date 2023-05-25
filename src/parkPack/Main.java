package parkPack;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		int auswahl;
		long idEingabe;

		Parkhaus myParkhaus = new Parkhaus();
		myParkhaus.erstellKassenAutomat();
		do {
			System.out.println("\n1) Einfahren");
			System.out.println("2) Bezahlen");
			System.out.println("3) Ausfahren");
			System.out.println("4) Beenden");
			System.out.println("wählen sie Ihren program aus: \n");
			auswahl = myScanner.nextInt();
			switch (auswahl) {
				case 1:
					if (myParkhaus.platzFrei() == true) {
						System.out.println("Schranke öffnet sich");
						myParkhaus.einParken();
						System.out.println("Schranke schließt sich");

						break;
					} else {
						System.out.println("Einfahren nicht möglich, alle Parkplätze sind belägt.");
						break;
					}
				case 2:
					System.out.println("Sie haben Bezahlen gewählt.\n");
					System.out.println("Bitte Scannen Sie ihr Ticket!");
					idEingabe = myScanner.nextLong();
					Ticket tmp = (myParkhaus.ticketScannen(idEingabe));
					if (myParkhaus.getKassenAutomat().bezahlen(tmp)) {
						tmp.setIstBezahlt(true);
						System.out.println("Bezahlung Erfolgreich");
					} else {
						System.out.println(
								"Bezahlung konnte nicht durchgeführt werden! \n(Bitte wenden Sie sich an den Support unter www.supportparkhaus.com)");
					}
					break;
				case 3:
					System.out.println("Sie haben Ausfahren gawählt.");
					System.out.println("Bitte Scannen Sie Ihr Ticket!");
					idEingabe = myScanner.nextLong();
					switch (myParkhaus.ausparken(idEingabe)) {
						case 0:
							System.out.println("Schranke offnet:\nGute Fahrt!\nSchranke Schließt:");
							System.out.println("Belegte Parkplätze:" + myParkhaus.getBelegteStellenpletze() + "/250");
							break;
						case 1:
							System.out.println("Sie müssen erst bezahlen!");
							break;
						case 2:
							System.out.println("Falsche Karte oder Karte nicht erkannt.");
							break;
					}
					break;
				case 4:
					System.out.println("Programm wird Beended!");
					break;
			}
		} while (auswahl != 4);
	}
}