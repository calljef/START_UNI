package Livraria;

public class LIvro exends Livraria{

	private String autor;
	private String tema;
	private int qtdPag;
	public LIvro(String autor, String tema, int qtdPag) {
		super();
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
	public void setQtdPag(int qtdPag) {
		this.qtdPag = qtdPag;
	}
	
	
}
