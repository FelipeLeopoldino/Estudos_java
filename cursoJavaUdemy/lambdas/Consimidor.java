package lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Consimidor {

	public static void main(String[] args) {
		
		Consumer<Produto> imprimir = p -> System.out.println(p.nome + "!!!");
		
		Produto p1=new Produto("Caneta", 1.30, 0.09);
		imprimir.accept(p1);
		Produto p2=new Produto("Caderno", 21.30, 0.09);
		Produto p3=new Produto("Lapis", 1.90, 0.09);
		Produto p4=new Produto("Borracha", 2.30, 0.09);
		Produto p5=new Produto("Mochilla", 210.30, 0.09);
		
		List<Produto> produtos = Arrays.asList(p1,p2,p3,p4,p5);
		
		produtos.forEach(imprimir);
		produtos.forEach(p -> System.out.println(p.preco));
		produtos.forEach(System.out::println);
	}
}
