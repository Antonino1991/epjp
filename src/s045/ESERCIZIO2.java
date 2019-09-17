package s045;

public class ESERCIZIO2 {
	public static void main(String[] args) {
		int gap = 'a' - 'A';

		String s = "BoB";
		String Smin = s ;

		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (c >= 'A' && c <= 'Z') {
				int C = c ;
				C = C + gap ;
				char cmin = (char) C ;
			
			
				s = s.replace(c, cmin);
				

			}

		}
		System.out.println(s);

}

}
