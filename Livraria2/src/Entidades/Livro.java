package Entidades;

public class Livro  extends Produto implements Imposto{
	
	private String autor;
	private String tema;
	private int qtdPag;
		
	private static final double PORCETAGEM = 0.1;
	
	public Livro() {		
	}
	
	public Livro(String autor, String tema, int qtdPag) {
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

	@Override
	public double calculaImposto(double imposto) {
		
		if(this.getTema() == "educativo") {
			
			return this.getQtdPag();
			
		}else {
			
			return this.getQtdPag()*PORCETAGEM;
		}
		
	}	

}
