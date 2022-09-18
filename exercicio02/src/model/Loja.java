package model;

import java.util.List;

public class Loja {
	
	private String nome;
	private String cnpj;		
	private List <Livro> livros;
	private List <VideoGame> videoGames;
	
	public Loja(String nome, String cnpj, List<Livro> livros, List<VideoGame> videoGames) {
		
		this.nome = nome;
		this.cnpj = cnpj;
		this.livros = livros;
		this.videoGames = videoGames;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public List<Livro> getLivros() {
		return livros;
	}

	public void setLivros(List<Livro> livros) {
		this.livros = livros;
	}

	public List<VideoGame> getVideoGames() {
		return videoGames;
	}

	public void setVideoGames(List<VideoGame> videoGames) {
		this.videoGames = videoGames;
	}

	public void listaLivros() {
		
		if(livros.size() == 0) {
			System.out.println("A loja não tem livros em seu estoque.");			
		} else {
			System.out.println("----------------------------------------------------------------");	
			System.out.println("A loja " + getNome() + " possui estes livros para a venda: ");
			
			for(Livro livro : livros) {
				System.out.println(livro);
			}
			System.out.println("----------------------------------------------------------------");
		}	
				
	}
	
	public void listaVideoGames() {
		
		if(videoGames.size() == 0) {
			System.out.println("A loja não tem video-games em seu estoque.");			
		} else {
			System.out.println("A loja " + getNome() + " possui estes video-games para a venda: ");
			
			for(VideoGame videoGame : videoGames) {
				System.out.println(videoGame);
			}
			
			System.out.println("----------------------------------------------------------------");
			
		}
	}
	
	public double calculaPatrimonio() {
		
		double patrimonio = 0.0;
		
		
		for(VideoGame videoGame : videoGames) {
			
			patrimonio += videoGame.getPreco() * videoGame.getQtd();
		}
		
		for(Livro livro : livros) {
			patrimonio += livro.getPreco() * livro.getQtd();
		}
		
		System.out.println("O patrimonio da loja: " + getNome() + " é de R$" + patrimonio);
		return patrimonio;
	}
	
	
}
