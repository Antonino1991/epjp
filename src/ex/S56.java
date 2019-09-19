package ex;

public class S56 {
	/**
	 * Reverse a string
	 * 
	 * @param s
	 * @return the input reversed
	 */
	public static String reverse(String s) {
		StringBuilder sb = new StringBuilder();
		for (int i = s.length() - 1; i >= 0; i--) {
			sb.append(s.charAt(i));

		}
		return sb.toString();
	}

	/**
	 * Check if the parameter is a palindrome
	 * 
	 * @param s
	 * @return true if the parameter is a palindrome
	 */
	public static boolean isPalindrome(String s) {
		String b = reverse(s);
		if (s.equals(b)) {
			return true;

		}

		return false;
	}

	/**
	 * Remove vowels from the parameter
	 * 
	 * @param s
	 * @return a string, same of input but without vowels
	 */
	public static String removeVowels(String s) {
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i <= s.length() - 1; i++) {
			char c = s.charAt(i);
			if (c != 'a' && c != 'e' && c != 'i' && c != 'o' && c != 'u' && c != 'A' && c != 'E' && c != 'I' && c != 'O'
					&& c != 'U') {
				sb.append(c);
			}
		}
		return sb.toString();

	}

	/**
	 * Convert from binary to decimal
	 * 
	 * @param s a string that contains the binary representation of an integer
	 * @return the converted integer
	 */
	public static int bin2dec(String s) {
		int sum = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '1') {
				sum += Math.pow(2, s.length() - 1 - i);
			}
		}
		return sum;
	}

	/**
	 * Reverse an array of integers
	 * 
	 * @param data
	 * @return a new array holding the same elements of input, in reversed order
	 */
	public static int[] reverse(int[] data) {
		int[] result = new int[data.length];
		for (int i = 0; i <= result.length - 1; i++) {
			result[i] = data[(result.length - 1) - i];

		}
		return result;

	}

	/**
	 * Calculate the average
	 * 
	 * @param data
	 * @return the average
	 */
	public static double average(int[] data) {
		int sum = 0;
		for (int i = 0; i <= data.length; i++) {
			sum = data[i] + data[i + 1];
		}
		return sum / (data.length - 1);
	}

	/**
	 * Find the largest value
	 * 
	 * @param data
	 * @return the largest value
	 */
	public static int max(int[] data) {
		int max = 0;
		for (int i = 0; i <= data.length - 1; i++) {
			if (data[i] > data[i + 1]) {
				max = data[i];
			}
		}

		return max;
	}
}
