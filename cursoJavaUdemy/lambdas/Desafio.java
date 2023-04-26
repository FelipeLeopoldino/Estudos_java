package lambdas;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Desafio {
	public static void main(String[] args) {

		/*
		 * 1- A parti do produto calcular o preco real ( com desconto) 2- Impostp
		 * Municipal: >=2500 (8,5%) < 2500 (isento) 3- Frete: >= 3000(100)/ <3000(50) 4-
		 * Arredondar : Deixar duas casas decimais 5- formatar : R$1234,56
		 * 
		 */

		Function<Produto, Double> precoFinal = p -> p.preco * (1 - p.desconto);

		UnaryOperator<Double> impostoMunicipal = preco -> preco >= 2500 ? preco * 1.085 : preco;

		UnaryOperator<Double> frete = preco -> preco >= 3000 ? preco + 100 : preco + 50;

		UnaryOperator<Double> arredondar = preco -> Double.parseDouble(String.format("%2.0f", preco));

		Function<Double, String> formatar = preco -> ("R$" + preco).replace(".", ",");


		Produto produto = new Produto("Ipad", 3235.89, 0.13);
		String p = precoFinal.andThen(impostoMunicipal).andThen(frete).andThen(arredondar).andThen(formatar)
				.apply(produto);

		System.out.println("O preço final é " + p);

	}
}
