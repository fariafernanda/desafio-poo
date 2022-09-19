package main;

import java.util.ArrayList;
import java.util.List;

import model.Guerreiro;
import model.Mago;
import model.Personagem;

public class Main {

	public static void main(String[] args) {
		
		List<String> magias = new ArrayList<>();
		magias.add("invisibilidade");
		magias.add("conjuramento");
		List<String> habilidades = new ArrayList<>();
		habilidades.add("espada");
		habilidades.add("escudo");
		
		Mago gandalf = new Mago("Gandalf", 90, 225, 9000, 180, 45, 9, magias);
		Mago presto = new Mago("Presto", 10, 25, 1000, 20, 5, 1, null);
		Guerreiro lionheart = new Guerreiro("Lionheart", 150, 60, 6000, 30, 120, 6, habilidades);
		Guerreiro arya = new Guerreiro("Arya Stark", 50, 20, 2000, 10, 40, 2, null);

		System.out.println(gandalf);
		System.out.println(presto);
		System.out.println(lionheart);
		System.out.println(arya);
		
		System.out.println("Personagens criados: " + Personagem.getContador());
		System.out.println("---------------------------------------------");
		
		System.out.println("Batalha:: " + gandalf.getNome() + " x " + lionheart.getNome());
		gandalf.attack();
		lionheart.attack();
		
		System.out.println("---------------------------------------------");
		
		gandalf.lvlUp();
		System.out.println(gandalf);
		presto.lvlUp();
		System.out.println(presto);
	}
	

}
