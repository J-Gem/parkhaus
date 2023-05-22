package parkPack;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String wahl = null;
		System.out.println("1) Einfahren");
		System.out.println("2) Bezahlen");
		System.out.println("3) Ausfahren");
		System.out.println("wählen sie Ihren program aus: ");
		int auswahl = s.nextInt();
		switch (auswahl) {
			case 1:
				System.out.println("Sie haben Einfahren gewählt.");
				break;
			case 2:
				System.out.println("Sie haben Bezahlen gewählt.");
				break;
			case 3:
				System.out.println("Sie haben Ausfahren gawählt.");
				break;

		}
	}
}