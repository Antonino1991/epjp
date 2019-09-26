package esercizi;

import java.util.*;

public class MostPopular {

	public static void main(String[] args) {
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		String s = "abcbab";

		for (int i = 0; i < s.length(); i++) {
			if (map.containsKey(s.charAt(i))) {
				map.put(s.charAt(i), (int) map.get(s.charAt(i)) + 1);
			} else {
				map.put(s.charAt(i), 1);
			}
		}

//		map.keySet().size();

		char mostPop = '*';
		int max = Integer.MIN_VALUE;
		Iterator<Map.Entry<Character, Integer>> it = map.entrySet().iterator();

		while (it.hasNext()) {
			
		}
			
		
			
				System.out.println(it.next());
		
	System.out.println(map);
	}
}
