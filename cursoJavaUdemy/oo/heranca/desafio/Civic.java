package oo.heranca.desafio;

public class Civic extends Carro {

	Civic() {
		super(212);
	}

	Civic(int velocidadeMaxima) {
		super(velocidadeMaxima);
		delta = 350;
	}
}
