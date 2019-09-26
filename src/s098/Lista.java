package s098;

public class Lista {
	public static void main(String[] args) {
		String s = "abbcdd";
		System.out.println("i caratteri senza doppioni sono :");

	}

	public String comparateChar(String s) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < s.length(); i++) {
			char temp = s.charAt(i);

			for (int j = 0; j < sb.length(); j++) {

				if (temp != sb.charAt(j)) {
					sb.append(temp);
				}
				continue;
			}

		}
		return sb.toString();
	}
}
