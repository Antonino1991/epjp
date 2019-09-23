package s068bis;

public class Dipendente extends Persona {
	private double salario;

	public Dipendente(String name, String surname, double salario) {
		super(name, surname);
		this.salario = salario;
	}

	public double getSalario() {
		return salario;

	}

	@Override
	public String toString() {
		return "Dipendente [salario=" + salario + ", toString()=" + super.toString() + "]";
	}

}
