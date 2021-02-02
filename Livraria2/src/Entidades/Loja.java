package Entidades;

import java.util.ArrayList;
import java.util.List;

public class Loja {
	
	private String nome;
	private String cnpj;
	private List<Livro> livros;
	private List<VideoGame> videoGames;
	
	public Loja() {		
	}
	
	public Loja(String nome, String cnpj, List<Livro> livros, List<VideoGame> videoGames) {
		super();
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
	
	public void ListaLivros() {
		
		if(livros.size() > 0) {			
		
			for(Livro livro : livros) {
				
				System.out.println(livro);
			}
			
		}else {
			
			System.out.println("A loja não tem livros no seu estoque");
			
		}
	}
	
	public void ListaVideoGames() {
		
		if(videoGames.size() > 0) {			
			
			for(VideoGame videoGame : videoGames) {
				
				System.out.println(videoGame);
			}
			
		}else {
			
			System.out.println("A loja não tem videogames no seu estoque");			
		}		
		
	}
	
	public double CalculaPatrimonio() {
		
		Double ValorTotalVideoGames = 0.0;
		Double ValorTotalLivros = 0.0;	
		
		for(Livro livro : livros) {
			
			Double valorLivro = livro.getPreco();
			int qtdLivro = livro.getQtd();
			
			Double ValorTotalLivro = valorLivro*qtdLivro;
			ValorTotalLivros += ValorTotalLivro;
		}		
		
		for(VideoGame videoGame : videoGames) {
			
			Double valorVideoGame = videoGame.getPreco();
			int qtdVideoGame = videoGame.getQtd();
			
			Double ValorTotalVideoGame = valorVideoGame*qtdVideoGame;
			ValorTotalVideoGames += ValorTotalVideoGame;
		}
	
		return ValorTotalLivros + ValorTotalVideoGames;
		
	}

}
