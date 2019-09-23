package s068bis;

public class Consulente extends Persona {
	private double fattura;

	public Consulente(String name, String surname, double fattura) {
		super(name, surname);
		this.fattura = fattura;
	}

	public double getFattura() {
		return fattura;
	}

	@Override
	public String toString() {
		return "Consulente [fattura=" + fattura + ", toString()=" + super.toString() + "]";
	}

}
