package s091ex;

import java.util.Scanner;

public class Paridispari {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNextInt()) {
			int d = 0;
			d = scanner.nextInt();
			if (d == 0) {
				System.out.println("il valore � zero");
			} else if (d % 2 == 0) {
				System.out.println(d + " " + "� pari");
			} else if (d % 2 != 0) {
				System.out.println(d + " " + "� dispari");

			}

		}
		scanner.close();
	}
}
