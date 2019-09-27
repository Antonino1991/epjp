package esercizi;

//import jdk.nashorn.internal.runtime.Context.ThrowErrorManager;

public class Armstrong {

	public static boolean isArmstrong(int data) {
		if (data<0) {
			throw new IllegalArgumentException("il numero è negativo!");
		}
		
		int num = 0;
		int exp = 0;
		int armstrong = 0;
		int temp = data;
		int temp2 = data;

		while (temp != 0) {
			temp = temp / 10;

			exp++;
		}

		while (temp2 != 0) {
			num = temp2 % 10;
			armstrong += (int) Math.pow(num, exp);
			temp2 = temp2 / 10;
		}
		if (armstrong == data) {
			return true;
		}
		return false;
	}

}
