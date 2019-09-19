package ex;

public class S55 {
	/**
	 * Add up all the numbers in the passed closed interval
	 * 
	 * @param first the left limit
	 * @param last  the right limit
	 * @return the sum of all the numbers, or zero
	 */
	public static long sum(int first, int last) {
		long som = 0;
		if (first < last) {

			for (int i = first; i <= last; i++) {
				som += i;
			}
		}
		return som;

	}

	/**
	 * Add up only the even numbers in the passed closed interval
	 * 
	 * @param first the left limit
	 * @param last  the right limit
	 * @return the sum of all the even numbers, or zero
	 */
	public static long evenSum(int first, int last) {
		long som = 0;
		for (int i = first; i <= last; i++) {
			if (i % 2 == 0) {
				som += i;

			}
		}
		return som;

	}

	/**
	 * Factorial
	 * 
	 * @param value
	 * @return factorial of input value, or zero
	 */
	public static long factorial(int value) {
		if (value < 0) {
			return 0;
		}
		long fac = 1;
		for (int i = 1; i <= value; i++) {
			fac *= i;

		}
		return fac;
	}

	/**
	 * Fibonacci number (0, 1, 1, 2, 3, 5, 8, …)
	 * 
	 * @param value
	 * @return the Fibonacci number of value, or zero
	 */
	public static long fibonacci(int value) {
		int fib1 = 0, fib2 = 1, fib3 = 0;

		for (int i = 2; i <= value; i++) {
			fib3 = fib1 + fib2;
			fib1 = fib2;
			fib2 = fib3;

		}
		return fib3;
	}

	/**
	 * Multiplication table
	 * 
	 * @param value
	 * @return The multiplication table for value, when possible
	 */
	public static int[][] multiplicationTable(int value) {
		int[][] result = new int[0][0];

		// TODO

		return result;
	}
}
