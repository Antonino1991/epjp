package esercizi;

import java.util.HashSet;

public class panGram {

	public static boolean isPangram(String s) {
		if (s == null) {
			throw new IllegalArgumentException("The string is null");
		}
		s = s.toLowerCase();
		HashSet<Character> ts = new HashSet<>();
		for (int i = 0; i < s.length(); i++) {

			char c = s.charAt(i);
			if (c >= 'a' && c <= 'z') {
				ts.add(c);

			}

		}
		if (ts.size() == 26) {
			return true;
		}
		return false;
	}
}