package s068ex;

import java.util.Random;

public class Umano extends Personaggio {

	public Umano(String name, int life_points, String clan_name) {
		super(name, life_points, clan_name);

	}

	public void Attack(Personaggio nemico) {
		Random random = new Random();
		int danno = random.nextInt(10);
		nemico.Danno(danno);
	}
}
