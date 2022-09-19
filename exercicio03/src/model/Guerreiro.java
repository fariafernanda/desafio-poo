package model;
import java.util.List;
import java.util.Random;

public class Guerreiro extends Personagem {

	private List<String> habilidade;
	
	public Guerreiro(String nome, int vida, int mana, float xp, int inteligencia, int forca, int level, List<String> habilidade) {
		super(nome, vida, mana, xp, inteligencia, forca, level);
		
		this.habilidade = habilidade;
	}
	
	public int attack() {
		Random geradorRandom = new Random();
		int ataque;
		int nRandom = geradorRandom.nextInt(300) + 1;		
		ataque = getForca() * getLevel() + nRandom;
		
		System.out.println(getNome() + " fez um ataque de " + ataque + " pontos.");

		return ataque;
	}
	
	public void aprenderHabilidade(String habilidade) {
		
		this.habilidade.add(habilidade);
	}

	public List<String> getHabilidade() {
		return habilidade;
	}

	public void setHabilidade(List<String> habilidade) {
		this.habilidade = habilidade;
	}

	@Override
	public void lvlUp() {
	
		int level = getLevel() + 1;
		
		System.out.println(getNome() + " avançou do level " + getLevel() + " para o level " + level + ".");
		
		setVida(getVida() + 25);
		setForca(getForca() + 20);
		setMana(getMana() + 10);
		setInteligencia(getInteligencia() + 5);
		
		setLevel(getLevel() + 1);
		setXp(getXp() + 1000);
	}

	@Override
	public String toString() {
		return "Nome: " + getNome() + " - Vocação: Guerreiro - Level: " + getLevel() + "\nVida: " + getVida() + "\nMana: " + getMana() + "\nXP: " + getXp()
				+ "\nInteligência: " + getInteligencia() + "\nForça: " + getForca() + "\n---------------------------------------------";
	}
}
