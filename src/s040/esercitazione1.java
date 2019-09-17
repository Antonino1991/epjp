package s040;

public class esercitazione1 {
	public static void main(String[] args) {
		boolean[] flags = { true, false, false };
		for (int i = 0; i < flags.length; i++) {
			System.out.println(flags[i]);
		}

		for (int i = 0; i < flags.length; i++) {
			if (flags[i] == false) {
				flags[i] = true;
			}

			System.out.println(flags[i]);
			}
			


	}

}
	