package parkPack;

import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		int input;
		Scanner myScanner = new Scanner(System.in);
		Parkhaus myParkhaus = new Parkhaus();
		System.out.println("PARKHAUS");

		do {
			System.out.println("[1]PARKHAUS BETRETEN [2]PARKHAUS VERLASEN [0]APP SCHLIESEN");
			input = myScanner.nextInt();
		} while (input != 0);
	}
}
