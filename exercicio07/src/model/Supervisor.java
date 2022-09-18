package model;

public class Supervisor extends Funcionario {

	public Supervisor(String nome, int idade, double salario) {
		super(nome, idade, salario);
		
	}
	
	@Override
	public double bonificacao() {
		
		double bonus = 5000.0;
		
		return getSalario() + bonus;
	}
	
	@Override
	public String toString() {
		return "Cargo: Supervisor - Nome: " + getNome() + " - Salário: R$" + getSalario() +  " - Bonificação: R$" + bonificacao();
	}

}
