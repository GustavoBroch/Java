package exercicio3;

import java.util.ArrayList;
import java.util.List;

public class Colecao {

	public static void main(String[] args) {

		Produto ioio = new Produto("Razer", 150.00f, 2);
		Produto chiclete = new Produto("Big Big", 0.25f, 40);
		Produto chinelo = new Produto("Havaianas", 50f, 40);
		Produto micanga = new Produto("Hyst", 5f, 10);

		List<Produto> estoque = new ArrayList<>();

		System.out.println("Armazenar dados");
		estoque.add(ioio);
		estoque.add(chiclete);
		estoque.add(chinelo);

		for (Produto p : estoque) {
			System.out.println(estoque.indexOf(p) + "|"+ p.toString());
		}

		System.out.println("\nRemover dados");
		estoque.remove(chiclete);

		for (Produto p : estoque) {
			System.out.println(p.toString());
		}
		
		estoque.set(1, micanga);
		
		System.out.printf("\nAtualização\n");
		for (Produto p : estoque) {
			System.out.println(p.toString());
		}

		
	}

}
