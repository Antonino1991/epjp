package esercizi;

public class mergeSorted {

	public static int[] mergeSort(int[] s, int[] b) {
		int[] sb = new int[s.length + b.length];
		int i = 0;
		int j = 0;
		int k = 0;
		while (i < s.length && j < b.length) {
			if (s[i] < b[j]) {
				sb[i] = s[i];
				i++;
				k++;

			}
			if (s[i] > b[j]) {
				sb[i] = b[j];
				j++;
				k++;
			}

		}
		return sb;
	}
}