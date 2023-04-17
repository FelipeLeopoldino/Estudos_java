package oo.heranca.desafio;

public class TesteCarro {

	public static void main(String[] args) {
		Carro civic = new Civic(450);
		Carro palio = new Palio();

		civic.acelerar();
		palio.acelerar();

		System.out.println("Civic " + civic);
		System.out.println("Palio " + palio);

		civic.freiar();
		palio.freiar();

		System.out.println("Civic " + civic);
		System.out.println("Palio " + palio);
	}
}
