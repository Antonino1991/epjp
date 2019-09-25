package s098;

//import java.util.ArrayList;

public class Lista {
	public static void main(String[] args) {
		String s = "abbcdd";

	}

	public String comparateChar(String s) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < s.length(); i++) {
			for (int j = 0; j < sb.length(); j++) {
				char temp = s.charAt(i);
				if (temp != sb.charAt(j)) {
					sb.append(temp);
				}
				continue;
			}

		}
		sb.toString();
		return "";
	}

}
