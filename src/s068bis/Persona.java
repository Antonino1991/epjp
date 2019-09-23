package s068bis;

public class Persona {
	private String name;
	private String surname;

	public Persona(String name, String surname) {
		super();
		this.name = name;
		this.surname = surname;
	}

	public String getName() {
		return name;
	}

	public String getSurname() {
		return surname;

	}

	@Override
	public String toString() {
		return "Persona [name=" + name + ", surname=" + surname + "]";
	}
}
