package laboratorNr2;

import java.util.Random;
import java.util.Scanner;

public class Exercitii {

	public static void main(String[] args) {
		@SuppressWarnings("unused")
		Scanner scanner = new Scanner(System.in);
		System.out.println("Alegeti exercitiul dorit (1 - 3): ");
		int value = scanner.nextInt();
		
		switch (value) {
		case 1:
			exercitiu1();
			break;
		case 2:
			exercitiu2();
			break;
		case 3:
			exercitiul3();
			break;
		default:
			System.out.println("Eroare");
			break;
		}

	}

	private static void exercitiul3() {
		@SuppressWarnings("unused")
		Scanner scanner = new Scanner(System.in);

		Masina car = new Masina();
		car.setCuloareString("rosu");
		car.setTip("Dacia");
		car.setViteza(25.0);

		System.out.println("Culoare masina: " + car.getCuloareString());
		System.out.println("Tip masina: " + car.getTip());
		System.out.println("Viteza masina: " + car.getViteza());

		System.out.println(car.toString());

		System.out.print("Introduceti un numar: ");
		int number = scanner.nextInt();
		Masina[] masini = new Masina[number];
	}

	private static void exercitiu2() {
		@SuppressWarnings("unused")
		Scanner scanner = new Scanner(System.in);
		ContBancar cont2 = new ContBancar(500);
		System.out.println("Sold: " + cont2.getSold());
		cont2.depozitareCont(300);
		System.out.println("Sold: " + cont2.getSold());

		Random rand = new Random();
		int rand1 = rand.nextInt(1001);

		for (int i = 0; i < rand1; i++) {
			double value = rand.nextDouble() * 100;
			int rand2 = rand.nextInt(2);
			if (rand2 == 0) {
				Boolean resultBoolean = cont2.extragereCont(value);
				if (resultBoolean) {
					System.out.println("Operatie efectuata");
				} else {
					System.out.println("Sold Insuficient");
				}
			} else {
				cont2.depozitareCont(value);
			}
			System.out.printf("Valoare sold nou: %.2f", cont2.getSold()).println();
			;
		}
	}

	private static void exercitiu1() {
		@SuppressWarnings("unused")
		Scanner scanner = new Scanner(System.in);
		System.out.printf("Introduceti suma dorita: ");
		double sum = scanner.nextDouble();

		ContBancar cont1 = new ContBancar(0);

		cont1.depozitareCont(sum);
		System.out.println(cont1.getSold());

		System.out.printf("Introduceti suma dorita: ");
		sum = scanner.nextDouble();
		cont1.depozitareCont(sum);

		System.out.println(cont1.getSold());
	}

}
