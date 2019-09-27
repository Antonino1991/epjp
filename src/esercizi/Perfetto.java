package esercizi;

public class Perfetto {
	public static boolean numeroPerfetto(int value) {

		int divisore = 1;
		int sum = 1;
		while (divisore <= value / 2) {
			if (value % divisore == 0) {
				sum += divisore;
				divisore++;

			}

		}
		if (sum == value) {
			return true;
		}

		return false;

	}

	public static boolean numeroAbbondante(int value) {

		int divisore = 1;
		int sum = 1;
		while (divisore <= value / 2) {
			if (value % divisore == 0) {
				sum += divisore;
				divisore++;

			}

		}
		if (sum > value) {
			return true;
		}
		return false;
	}

	public static boolean numeroDifettivo(int value) {

		int divisore = 1;
		int sum = 1;
		while (divisore <= value / 2) {
			if (value % divisore == 0) {
				sum += divisore;
				divisore++;

			}

		}
		if (sum < value) {
			return true;
		}
		return false;
	}
}
