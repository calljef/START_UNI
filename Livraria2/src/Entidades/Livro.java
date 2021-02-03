package Entidades;

import java.util.List;

public class Livro  extends Produto implements Imposto{
	
	private String autor;
	private String tema;
	private int qtdPag;
	
	public Livro() {		
	}	

	public Livro(String nome, Double preco, int qtd, String autor, String tema, int qtdPag) {
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

	public void setQtdPag(int qtdPag) {
		this.qtdPag = qtdPag;
	}

	@Override
	public double calculaImposto() {
		
		if(this.getTema() == "educativo") {
			
			return 0.0;
			
		}else {
			
			return this.getPreco() * 0.1;
		}
		
	}	

}
