package main;

import model.Gerente;
import model.Supervisor;
import model.Vendedor;

public class Main {

	public static void main(String[] args) {
		
		Gerente g1 = new Gerente("José", 36, 2000);
		Supervisor s1 = new Supervisor("Ana", 28, 2000);
		Vendedor v1 = new Vendedor("Luis", 20, 2000);
		
		
		System.out.println(g1);
		System.out.println(s1);
		System.out.println(v1);
	}

}
