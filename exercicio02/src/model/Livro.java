package model;
import interfaces.Imposto;

public class Livro extends Produto implements Imposto{

	private String autor;
	private String tema;
	private int qtdPag;
	
	
	public Livro(String nome, double preco, int qtd, String autor, String tema, int qtdPag) {
		super(nome, preco, qtd);
		
		this.autor = autor;
		this.tema = tema;
		this.qtdPag = qtdPag;
	}


	public String getAutor() {
		return autor;
	}


	public void setAutor(String autor) {
		this.autor = autor;
	}


	public String getTema() {
		return tema;
	}


	public void setTema(String tema) {
		this.tema = tema;
	}


	public int getQtdPag() {
		return qtdPag;
	}


	public void setQtdPaginas(int qtdPag) {
		this.qtdPag = qtdPag;
	}
	
	@Override
	public double calculaImposto() {
		
		double imposto;
		
		if(tema == "educativo") {
			imposto = getPreco() * 0.0;
			System.out.println("Livro educativo não tem imposto: " + getNome());
			
			return imposto;
		} else {
			imposto = getPreco() * 0.1;
			System.out.println("R$" + imposto + " de impostos sobre o livro " + getNome());
			return imposto;
		}
	}


	@Override
	public String toString() {
		return "Título: " + getNome() + ", preço: R$" + getPreco() + ", quantidade: " + getQtd() + " em estoque.";
	}
	
	
	
	
}