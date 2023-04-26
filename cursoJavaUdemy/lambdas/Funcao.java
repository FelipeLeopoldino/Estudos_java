package lambdas;

import java.util.function.Function;

public class Funcao {

	public static void main(String[] args) {

		Function<Integer, String> paraOuImpar = numero -> numero % 2 == 0 ? "Par" : "Ímpar";

		Function<String, String> oResultadoE = valor -> "O resultado é: " + valor;
		
		Function<String, String> empolgado = valor -> valor + "!!!";
		
		Function<String, String> dulvida = valor -> valor + "???";
		
		String resultadoFinal = paraOuImpar
				.andThen(oResultadoE)
				.andThen(empolgado)
				.apply(32);
		
		String resultadoFinal2 = paraOuImpar
				.andThen(oResultadoE)
				.andThen(dulvida)
				.apply(33);
		
		System.out.println(paraOuImpar.apply(22));
		System.out.println(resultadoFinal);
		System.out.println(resultadoFinal2);
	}
}
