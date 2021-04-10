package Entidade;

public class Sorvete {
	private int id;
	private String sabor;
	private String tipo;// de Fruta ou essência 
	private double valor;
	
	@Override
	public boolean equals(Object obj) {
		Sorvete sorveteEntrada = (Sorvete)obj;
		if (sorveteEntrada.getSabor().equals(this.sabor)) {
			return true;
		}else {
			return false;
		}
	}

	@Override
	public String toString() {
		return "Id="+id+"  sabor=" + sabor + ", tipo=" + tipo + ", valor=" + valor + "";
	}

	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
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
