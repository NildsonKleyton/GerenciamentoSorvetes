package Entidade;

public class Sorvete {
	private int cod;
	private String sabor;
	private String tipo;// de Fruta ou essência 
	private double quantidade;
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
		return "Código="+cod+"  sabor=" + sabor + ", tipo=" + tipo + ", valor=" + valor + "";
	}

	public int getCod() {
		return cod;
	}

	public String getSabor() {
		return sabor;
	}

	public String getTipo() {
		return tipo;
	}

	public double getQuantidade() {
		return quantidade;
	}

	public double getValor() {
		return valor;
	}

	public void setCod(int cod) {
		this.cod = cod;
	}

	public void setSabor(String sabor) {
		this.sabor = sabor;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public void setQuantidade(double quantidade) {
		this.quantidade = quantidade;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	
	
}
