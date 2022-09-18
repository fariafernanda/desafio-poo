package model;

public class Gerente extends Funcionario {

	public Gerente(String nome, int idade, double salario) {
		super(nome, idade, salario);
		
	}

	@Override
	public double bonificacao() {
		
		double bonus = 10000.0;
		
		return getSalario() + bonus;
	}

	@Override
	public String toString() {
		return "Cargo: Gerente - Nome: " + getNome() + " - Salário: R$" + getSalario() +  " - Bonificação: R$" + bonificacao();
	}

	
	
}
