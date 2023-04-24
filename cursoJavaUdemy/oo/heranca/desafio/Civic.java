package oo.heranca.desafio;

public class Civic extends Carro implements Esportivo{

	public Civic() {
		super(212);
	}

	public Civic(int velocidadeMaxima) {
		super(velocidadeMaxima);
		delta = 15;
	}

	@Override
	public void ligarTurbo() {
		delta = 35;
	}

	@Override
	public void desligarTurbo() {
		delta = 15;
	}
}
