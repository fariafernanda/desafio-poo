package model;

public class Vendedor extends Funcionario {

	public Vendedor(String nome, int idade, double salario) {
		super(nome, idade, salario);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double bonificacao() {
		
		double bonus = 3000.0;
		
		return getSalario() + bonus;
	}

	@Override
	public String toString() {
		return "Cargo: Vendedor - Nome: " + getNome() + " - Salário: R$" + getSalario() +  " - Bonificação: R$" + bonificacao();
	}

	
	
}

