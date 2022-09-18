package main;

import model.Veiculo;

public class Main {

	public static void main(String[] args) {
		
		Veiculo carro = new Veiculo("Chevrolet", "Opala", "ABC1234","marrom", 100000f, 30, 80000d);
		
		
		System.out.println(carro);
		
		carro.pintar("azul petróleo");
		System.out.println("Cor do veículo: " + carro.getCor());
		
		carro.ligar();
		System.out.println("Ligado: " + carro.isLigado());
		carro.ligar();
		
		carro.abastecer(20);
		System.out.println("Litros de combustível: " + carro.getLitrosCombustivel());
		carro.abastecer(20);
		System.out.println("Litros de combustível: " + carro.getLitrosCombustivel());
		carro.abastecer(10);
		
		//Tentando frear com carro parado:
		carro.frear();
		
		carro.acelerar();
		carro.acelerar();	
		
		System.out.println("Velocidade: " + carro.getVelocidade());
		
		//Tentando desligar com carro em movimento:
		carro.desligar();
		
		carro.frear();
		System.out.println("Velocidade: " + carro.getVelocidade());
		carro.frear();
		System.out.println("Velocidade: " + carro.getVelocidade());
		carro.frear();
		carro.frear();
		carro.frear();
		carro.frear();
		
		carro.desligar();
		System.out.println("Ligado: " + carro.isLigado());
	}

}