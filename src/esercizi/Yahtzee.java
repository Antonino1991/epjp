package esercizi;

import java.util.Set;
import java.util.TreeSet;

public class Yahtzee {
	public static int playYahtzee(int[] dadi, Combinazione comb) {
		int point = 0;

		switch (comb) {
		case UNO:
			return countOnes(dadi);
		case DUE:
			return countTwo(dadi);
		case TRE:
			return countThree(dadi);
		case QUATTRO:
			return countFour(dadi);
		case CINQUE:
			return countFive(dadi);
		case SEI:
			return countSix(dadi);
		case SCALAMIN:
			break;
		case SCALAMAX:
			break;
		case TRIS:
			break;
		case YAHTZEE:
			break;
		case FULL:
			break;
		case CHANCE:
			break;
		case SAMEFOUR:
			break;
		}

		return point;
	}

	public static int countOnes(int[] dice) {
		int point = 0;

		for (int die : dice) {
			if (die == 1) {
				point += 1;
			}
		}

		return point;
	}

	public static int countTwo(int[] dice) {
		int point = 0;

		for (int die : dice) {
			if (die == 1) {
				point += 2;
			}
		}

		return point;
	}

	public static int countThree(int[] dice) {
		int point = 0;

		for (int die : dice) {
			if (die == 1) {
				point += 3;
			}
		}

		return point;
	}

	public static int countFour(int[] dice) {
		int point = 0;

		for (int die : dice) {
			if (die == 1) {
				point += 4;
			}
		}

		return point;
	}

	public static int countFive(int[] dice) {
		int point = 0;

		for (int die : dice) {
			if (die == 1) {
				point += 5;
			}
		}

		return point;
	}

	public static int countSix(int[] dice) {
		int point = 0;

		for (int die : dice) {
			if (die == 1) {
				point += 6;
			}
		}

		return point;
	}

	public static int minScala(int[] dice) {
		int point = 0;
		Set<Integer> sMin = new TreeSet<Integer>();
		//for(int i =0; i<)
	//	if (sMin.size()==5 && )
		

		return point += 30;
	}
	public static int maxScala(int[] dice) {
		int point = 0;
		
		

		return point += 40;
	}
}
