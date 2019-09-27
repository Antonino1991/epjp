package esercizi;

import java.nio.channels.IllegalSelectorException;

public class Hamming {

	public static int hammingDistance(String s, String b) {
		if (s.length() != b.length()) {
			throw new IllegalSelectorException();
		}
		int distance = 0;
		for (int i = 0; i < s.length(); i++) {
			for (int j = 0; j < b.length(); j++) {
				char cs = s.charAt(i);
				char bs = b.charAt(j);
				if (cs != bs) {
					distance++;

				}

			}
		}

		return distance;
	}
}
