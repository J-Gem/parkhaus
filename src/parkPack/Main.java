package parkPack;

import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		int auswahl;

		Parkhaus myParkhaus = new Parkhaus();
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
						System.out.println("Schranke öffrnt sich");
						myParkhaus.einParken();
						System.out.println("Schranke schließt sich");
						
						
						break;
					} else {
						System.out.println("Einfahren nicht möglich, alle Parkplätze sind belägt.");
						break;
					}
				case 2:
					System.out.println("Sie haben Bezahlen gewählt.");
					break;
				case 3:
					System.out.println("Sie haben Ausfahren gawählt.");
					break;
				case 4:
					System.out.println("Programm wird Beended!");
					break;
			}
		} while (auswahl != 4);
	}
}