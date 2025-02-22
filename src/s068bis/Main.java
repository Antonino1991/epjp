package s068bis;

public class Main {
	public static void main(String[] args) {

		Persona[] persone = new Persona[3];
		persone[0] = new Consulente("Mario", "Rossi", 900);
		persone[1] = new Dipendente("Luca", "Bianchi", 1900);
		persone[2] = new Consulente("Marco", "Belli", 700);
		persone[3] = new Dipendente("Anna", "Rossi", 500);
		for (Persona person : persone) {
			if (person instanceof Consulente) {
				Consulente c = (Consulente) person;
				System.out.println(c.getFattura());
			} else if (person instanceof Dipendente) {
				Dipendente e = (Dipendente) person;
				System.out.println(e.getSalario());
			}
		}

	}
}
