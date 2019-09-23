package s069;

public class Main {
	public static void main(String[] args) {
		X x = new X();
		System.out.println(x.toString());
		
		Mammal[] mammals = new Mammal[2];
		// System.out.println(mammals[0]);
		mammals[0] = new Dog(63, 40);// non posso creare mammal ma posso creare le classi derivati
		mammals[1] = new Cat(63, 20);

		for (Mammal mammal : mammals) { // for each
			System.out.println(mammal.toString()); // metodo di object lo posso sempre chiamare
		}
	}
}


class X extends Object{
	
}