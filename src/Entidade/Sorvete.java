package Entidade;

public class Sorvete {
	private String sabor;
	private String tipo;
	private double valor;
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		Sorvete sorveteEntrada = (Sorvete)obj;
		if (sorveteEntrada.getSabor().equals(this.sabor)) {
			return true;
		}else {
			return false;
		}
	}

	public Sorvete(String sabor, String tipo, double valor) {
		this.sabor = sabor;
		this.tipo = tipo;
		this.valor = valor;
	}
	
	public String getSabor() {
		return sabor;
	}
	public String getTipo() {
		return tipo;
	}
	public double getValor() {
		return valor;
	}
	public void setSabor(String sabor) {
		this.sabor = sabor;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	
}
