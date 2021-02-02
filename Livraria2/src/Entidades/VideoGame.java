package Entidades;

public class VideoGame  extends Produto implements Imposto{
	
	private String marca;
	private String modelo;
	private boolean isUsado;
	
	private static final double PORCETAGEM_USADO = 0.25;
	private static final double PORCETAGEM_NOVO = 0.45;
	
	
	public VideoGame() {		
	}
	
	public VideoGame(String marca, String modelo, boolean isUsado) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.isUsado = isUsado;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public boolean isUsado() {
		return isUsado;
	}

	public void setUsado(boolean isUsado) {
		this.isUsado = isUsado;
	}

	@Override
	public double calculaImposto(double imposto) {
		
		if(this.isUsado) {
			
			return this.getPreco() * PORCETAGEM_USADO;
			
		}else {
			
			return this.getPreco() * PORCETAGEM_NOVO;
			
		}		

	}
	
	
	

}
