package s068ex;

import java.util.Random;

public class Orco extends Personaggio {

	public Orco(String name, int life_points, String clan_name) {
		super(name, life_points, clan_name);

	}

	public int Attack() {
		Random random = new Random();
		int danno = random.nextInt(10);
		return danno;
	}
}
