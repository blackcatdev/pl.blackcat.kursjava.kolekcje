// Napisz program, który będzie pobierał od użytkownika imiona. Program powinien pozwolić użytkownikowi na wprowadzenie dowolnej liczby imion (wprowadzenie „-” jako imienia przerwie wprowadzanie). Na zakończenie wypisz liczbę unikalnych imion.

package pl.blackcat.kursjava.kolekcje;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Exercise1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Set<String> setWithNames = new HashSet<>();
		String temp;
		while (true) {
			System.out.print("Podaj imię. \"-\" kończy wprowadzanie: ");
			temp = scanner.nextLine();
			if (temp.equals("-"))
				break;
			else
				setWithNames.add(temp);
		}
		for (String item : setWithNames) {

			System.out.println(item);

		}

	}
}
