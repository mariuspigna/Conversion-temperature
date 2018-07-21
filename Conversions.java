package conversionTemperature;

import java.util.Scanner;

public class Conversions {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int mode = ' ';
		char reponse = ' ';
		int tempAconvertir;

		System.out.println("Bienvenue dans notre system de conversion ");
		System.out.println("Mode '1': Conversion °C en °F. " + "\nMode '2': Conversion °F en °C \n ");
		do {
			do {
				;
				mode = ' ';
				System.out.println("Choisir un mode de conversion");
				mode = sc.nextLine().charAt(0);

				if (mode != '1' && mode != '2') {
					System.out.println("Mode inconnu, veuillez réitérer votre choix. ");
				}

			} while (mode != '1' && mode != '2');
			if (mode == '1') {
				System.out.println("Choisir la temperature (en °C) à convertir");
				tempAconvertir = sc.nextInt();
				sc.nextLine();
				int farenheit = ((9 / 5 * tempAconvertir) + 32);
				System.out.println(tempAconvertir + " °C correspond à " + arrondi(farenheit, 2) + "°F");
			} else {
				System.out.println("Choisir la temperature (en °F) à convertir");
				tempAconvertir = sc.nextInt();
				sc.nextLine();
				int celsius = ((tempAconvertir - 32) * 5) / 9;
				System.out.println(tempAconvertir + " °F correspond à " + arrondi(celsius, 2) + "°C");
			}
			do {
				try {
					System.out.println("Voulez vous convertir une autre température ? O/N? ");
					reponse = sc.nextLine().charAt(0);
				} catch (StringIndexOutOfBoundsException e) {
					e.printStackTrace();
				}
			} while (reponse != 'O' && reponse != 'N');
		} while (reponse == 'O');
		System.out.println("Merci d'avoir utilisé notre application ");
	}

	public static double arrondi(double A, int B) {
		return (double) ((int) (A * Math.pow(10, B) + .5)) / Math.pow(10, B);
	}
}