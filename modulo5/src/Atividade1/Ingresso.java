package Atividade1;

public class Ingresso {

	public double valor;
	private boolean vendido;

	public Ingresso(double valor) {
		this.valor = valor;
		this.vendido = false;
	}

	public double getValor() {
		return valor;
	}

	public boolean isVendido() {
		return vendido;
	}

	public void vender() {
		this.vendido = true;
	}

	public String toString() {
		return "\nArquibancada - Valor de : R$ " + valor;
	}
}
