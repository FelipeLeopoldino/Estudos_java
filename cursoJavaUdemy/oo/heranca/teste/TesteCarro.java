package oo.heranca.teste;

import oo.heranca.desafio.Carro;
import oo.heranca.desafio.Civic;
import oo.heranca.desafio.Palio;

public class TesteCarro {

	public static void main(String[] args) {
		Civic civic = new Civic(450);
		Carro palio = new Palio();

		civic.acelerar();
		palio.acelerar();
		

		System.out.println("Civic " + civic);
		System.out.println("Palio " + palio);

		civic.freiar();
		palio.freiar();

		System.out.println("Civic " + civic);
		System.out.println("Palio " + palio);
		
		civic.ligarTurbo();
		System.out.println("Civic " + civic);
		
	}
}
