package ex;

public class S54 {
	/**
	 * Check if the parameter is positive, negative, or zero
	 * 
	 * @param value an integer
	 * @return "positive", "negative", or "zero"
	 */
	public static String checkSign(int value) {
		if (value > 0) {
			return "positive";
		}
		if (value < 0) {
			return "negative";
		} else {
			return "zero";

		}
	}

	/**
	 * Check if the parameter is odd
	 * 
	 * @param value an integer
	 * @return "odd" or "even"
	 */
	public static boolean isOdd(int value) {
		if (value % 2 == 0) {
			return false;
		} else {
			return true;
		}
	}

	/**
	 * Convert the parameter to its English name, if it is in [0..9]
	 * 
	 * @param value an integer
	 * @return "zero" for 0 ... "nine" for 9, or "other"
	 */
	public static String asWord(int value) {

		switch (value) {
		case 1:
			return "zero";

		case 2:
			return "uno";

		case 3:
			return "due";

		case 4:
			return "tre";

		case 5:
			return "quattro";

		case 6:
			return "cinque";

		case 7:
			return "sei";

		case 8:
			return "sette";

		case 9:
			return "otto";

		case 10:
			return "nove";

		default:
			return "other";
		}
	}

	public static String asWord1(int value) {
		if (value == 0) {
			return "zero";
		}
		if (value == 1) {
			return "uno";
		}
		if (value == 2) {
			return "due";
		}
		if (value == 3) {
			return "tre";
		}
		if (value == 4) {
			return "quattro";
		}
		if (value == 0) {
			return "zero";
		}
		if (value == 5) {
			return "cinque";
		}
		if (value == 6) {
			return "sei";
		}
		if (value == 7) {
			return "sette";
		}
		if (value == 8) {
			return "otto";
		}
		if (value == 9) {
			return "nove";
		} else {
			return "other";
		}
	}

	/**
	 * Convert a value in the interval [0, 100] to a letter in [A, F]
	 * 
	 * A if value > 90 B if value in (80, 90] ... F if value <= 50
	 * 
	 * @param percentile in [0, 100]
	 * @return a letter in [A, F]
	 */
	public static char vote(double percentile) {

		return 'F';
	}

	/**
	 * Leap year checker
	 * 
	 * @param year
	 * @return true if leap year
	 */
	public static boolean isLeapYear(int year) {
		if ((year % 4 == 0) && (year % 100 != 0 || year % 400 == 0)) {
			return true;
		}
		return false;
	}

	/**
	 * Sort the input parameters
	 * 
	 * @param a
	 * @param b
	 * @param c
	 * @return a sorted array
	 */
	public static int[] sort(int a, int b, int c) {
		int[] result = { a, b, c };
		boolean ord;
		do {
			ord = false;

			for (int i = 0; i < result.length - 1; i++) {
				if (result[i] > result[i + 1]) {
					int temp = result[i];
					result[i] = result[i + 1];
					result[i + 1] = temp;
					ord = true;
				}
			}
		} while (ord == true);

		return result;

	}
}
