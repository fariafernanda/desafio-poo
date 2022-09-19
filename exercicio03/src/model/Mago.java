package model;

import java.util.List;
import java.util.Random;

public class Mago extends Personagem {

	private List<String> magia;
	
	public Mago(String nome, int vida, int mana, float xp, int inteligencia, int forca, int level, List<String> magia) {
		super(nome, vida, mana, xp, inteligencia, forca, level);
		
		this.magia = magia;
	}
	
	public int attack() {
		Random geradorRandom = new Random();
		int ataque;
		int nRandom = geradorRandom.nextInt(300) + 1;		
		ataque = getInteligencia() * getLevel() + nRandom;
		
		System.out.println(getNome() + " fez um ataque de " + ataque + " pontos.");

		return ataque;
	}
	
	
	public void aprenderMagia(String magia) {
		
		this.magia.add(magia);
	}

	public List<String> getMagia() {
		return magia;
	}

	public void setMagia(List<String> magia) {
		this.magia = magia;
	}
	
	@Override
	public void lvlUp() {
		
		int level = getLevel() + 1;
	
		System.out.println(getNome() + " avançou do level " + getLevel() + " para o level " + level + ".");
		setMana(getMana() + 25);
		setInteligencia(getInteligencia() + 20);
		setVida(getVida() + 10);
		setForca(getForca() + 5);
		
		setLevel(getLevel() + 1);
		setXp(getXp() + 1000);
		
		
		
	}

	@Override
	public String toString() {
		return "Nome: " + getNome() + " - Vocação: Mago - Level: " + getLevel() + "\nVida: " + getVida() + "\nMana: " + getMana() + "\nXP: " + getXp()
				+ "\nInteligência: " + getInteligencia() + "\nForça: " + getForca() + "\n---------------------------------------------";
	}

	
}
