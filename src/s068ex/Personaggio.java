package s068ex;

public abstract class Personaggio {

	private String name;
	private int life_points;
	private String clan_name;

	public Personaggio(String name, int life_points, String clan_name) {
		this.name = name;
		this.life_points = life_points;
		this.clan_name = clan_name;
	}

	public String getName() {
		return name;
	}

	public void Danno(int danno) {
		this.life_points -= danno;
	}

	public int getlife_points() {
		return life_points;
	}

	public String getclan_name() {
		return clan_name;
	}
}
