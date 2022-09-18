package model;

public class Veiculo {

	private String marca;
	private String modelo;
	private String placa;
	private String cor;
	private float km;
	private boolean isLigado;
	private int litrosCombustivel;
	private int velocidade;
	private double preco;
	
	public void acelerar() {
		velocidade += 20;
		
	}
	
	public void frear() {
		if(velocidade <= 0 ) {
			System.out.println("O veículo está parado.");
			
		} else if (velocidade > 20){
			velocidade -= 20;
		} else {
			velocidade -=5;
		}
	}
	
	public void abastecer(int combustivel) {
		int tanqueCheio = 60;
		
		if(litrosCombustivel + combustivel < tanqueCheio) {
			litrosCombustivel += combustivel;
		} else {			
			System.out.println("Tanque cheio! Foi possível abastecer " + (tanqueCheio - litrosCombustivel) + " litros.");
			litrosCombustivel = tanqueCheio;
		}
	}
	
	public void pintar(String cor) {
		this.cor = cor;
	}
	
	public void ligar() {
		if(!(isLigado)) {
			isLigado = true;
		} else {
			System.out.println("O veículo já está ligado!");
		}
	}
	
	public void desligar() {
		if(isLigado && velocidade == 0) { 
			isLigado = false;
		}
		
		if(velocidade > 0) {
			System.out.println("Não é possível desligar o veículo em movimento.");
		}
		
	}

	public Veiculo(String marca, String modelo, String placa, String cor, float km, 
			int litrosCombustivel, double preco) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.placa = placa;
		this.cor = cor;
		this.km = km;
		this.litrosCombustivel = litrosCombustivel;
		this.preco = preco;
		this.isLigado = false;
		this.velocidade = 0;
		
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public float getKm() {
		return km;
	}

	public void setKm(float km) {
		this.km = km;
	}

	public boolean isLigado() {
		return isLigado;
	}

	public void setLigado(boolean isLigado) {
		this.isLigado = isLigado;
	}

	public int getLitrosCombustivel() {
		return litrosCombustivel;
	}

	public void setLitrosCombustivel(int litrosCombustivel) {
		this.litrosCombustivel = litrosCombustivel;
	}

	public int getVelocidade() {
		return velocidade;
	}

	public void setVelocidade(int velocidade) {
		this.velocidade = velocidade;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	@Override
	public String toString() {
		return "Veiculo: \nMarca: " + marca + ", Modelo: " + modelo + ", Placa: " + placa + ", Cor: " + cor + ", KMs: " + km
				+ ", Ligado: " + isLigado + ", Litros de Combustível: " + litrosCombustivel + ", Velocidade: " + velocidade
				+ ", Preço: " + String.format("%.2f", preco);
	}
	
	
}