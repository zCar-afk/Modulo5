package Atividade1;

public class IngressoVIP extends Ingresso {
	private double valorAdicional;

	public IngressoVIP(double valor, double valorAdicional) {
		super(valor);
		this.valorAdicional = valorAdicional;
	}

	public String toString() {
		double valorTotal = this.valor + this.valorAdicional;
		return "\nCamarote VIP - Valor de em Reais: " + valorTotal;
	}
}
