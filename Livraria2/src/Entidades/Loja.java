package Entidades;

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
	
	public void ListaLivros(List<Livro> livros) {
		
		if(livros.size() > 0) {			
		
			
		}else {
			
			
		}
	}
	
	public void ListaVideoGames(List<VideoGame> VideoGames) {
		
		if(videoGames.size() > 0) {			
		
			
		}else {
			
			
		}
		
		
	}
	
	public double CalculaPatrimonio(double patrimonio) {
		
		return 0;
		
	}

}
