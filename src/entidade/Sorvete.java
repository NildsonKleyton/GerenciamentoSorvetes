package entidade;

public class Sorvete {
	private int cod;
	private String sabor;
	private String tipo;// de Fruta ou essência 
	private double quantidade;
	private double valor;

	@Override
	public boolean equals(Object obj) {
		Sorvete sorveteEntrada = (Sorvete)obj;
		if (sorveteEntrada.getSabor().equalsIgnoreCase(this.sabor)) {
			return true;
		}else {
			return false;
		}
	}

	@Override
	public String toString() {
		return "Código="+cod+" sabor="+sabor+" tipo="+ tipo + " valor p/ litro =R$" + valor + " Quantidade"+quantidade+"L Valor Total:R$"+valor*quantidade ;
	}

	public int getCod() {
		return cod;
	}

	public void setCod(int cod) {
		this.cod = cod;
	}

	public String getSabor() {
		return sabor;
	}

	public void setSabor(String sabor) {
		this.sabor = sabor;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public double getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(double quantidade) {
		this.quantidade = quantidade;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}



	
	
}
