//Napisz program, który będzie pobierał od użytkownika imiona par dopóki nie wprowadzi imienia „-”, następnie poproś użytkownika o podanie jednego z wcześniej wprowadzonych imion i wyświetl imię odpowiadającego mu partnera.

package pl.blackcat.kursjava.kolekcje;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Exercise2 {

	public static void main(String[] args) {
		Map<String, String> coupleMap = new HashMap<>();
		Scanner scanner = new Scanner(System.in);
		String person1, person2;

		while (true) {
			System.out.print("Podaj imię partnera. \"-\" kończy wprowadzanie: ");
			person1 = scanner.nextLine();
			if (person1.equals("-"))
				break;
			System.out.print("Podaj imię partnerki. \"-\" kończy wprowadzanie: ");
			person2 = scanner.nextLine();
			if (person2.equals("-"))
				break;
			else
				coupleMap.put(person1, person2);

		}

		System.out.print("Podaj imię partnera do sprawdzenia: ");
		person1 = scanner.nextLine();
		person2 = coupleMap.get(person1);
		if (person2 == null || person2.equals(""))
			if (person1.charAt(person1.length() - 1) == 'a') {
				System.out.println("Wygląda na to, że " + person1 + " jest dziewczyną. Czy są jacyś chętni na jej chłopaka?");
				int bfFound = 0;
				for (Map.Entry<String, String> entry : coupleMap.entrySet()) {
					if (entry.getValue().equals(person1)) {
						bfFound++;
						System.out.println("Kandydat numer " + bfFound + " to: " + entry.getKey() + ".");
					}
				}
				if (bfFound == 0)
					System.out.println("Dla dziewczyny o imieniu " + person1 + " nie ma kandydata na chłopaka.");
				System.exit(0);

			} else {
				System.out.println(person1 + " nie ma nikogo.");
				System.exit(0);
			}
		System.out.println("Partnerka dla: " + person1 + " to: " + person2);
	}
}
