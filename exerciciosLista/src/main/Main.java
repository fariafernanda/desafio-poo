package main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import model.Pessoa;

// Exercícios 04, 05 e 06:

public class Main {

	public static void main(String[] args) {

		Pessoa p1 = new Pessoa("João", 15);
		Pessoa p2 = new Pessoa("Leandro", 21);
		Pessoa p3 = new Pessoa("Paulo", 17);
		Pessoa p4 = new Pessoa("Jessica", 18);

		List<Pessoa> pessoas = new ArrayList<>();
		pessoas.add(p1);
		pessoas.add(p2);
		pessoas.add(p3);
		pessoas.add(p4);

		System.out.println("-------- Lista original --------");
		for (Pessoa pessoa : pessoas) {
			System.out.println(pessoa);
		}

		// Imprimir o nome da pessoa mais velha:
		System.out.println("--------------------------------");
		Collections.sort(pessoas);

		System.out.println("Pessoa mais velha da lista: ");
		System.out.println(pessoas.get(pessoas.size() - 1));

		// Q5:
		// Exclusão de pessoas com idade inferior a 18:
		System.out.println("---------------------------------");
		
		System.out.println("Quantidade de pessoas na lista antes da exclusão: " + pessoas.size());
		System.out.println();
		pessoas.removeIf(pessoa -> pessoa.getIdade() < 18);

		System.out.println("Lista de pessoas com idade superior a 18:");
		
		for (Pessoa pessoa : pessoas) {
			System.out.println(pessoa);
		}
		
		System.out.println("Quantidade de pessoas na lista após exclusão: " + pessoas.size());

		System.out.println("---------------------------------");

		// Q6:
		// Consulte se o objeto Jessica existe na lista e exiba a sua idade.

		String consulta = "Jessica";
		
		System.out.println(pessoas.stream().filter(pessoa -> consulta.equals(pessoa.getNome())).findAny().orElse(null));
		
	}

}