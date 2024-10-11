package Atividade3;

public class ContaEspecial extends ContaCorrente {
	private double limiteCredito;

	public ContaEspecial(double saldo, double limiteCredito) {
		super(saldo);
		this.limiteCredito = limiteCredito;
	}

	public void sacar(double valor) {

		if (valor > 0 && (saldo + limiteCredito) >= valor) {
			saldo -= valor;
			System.out.println("Saque realizado na conta especial: R$ " + valor);
		} else {
			System.out.println("Saque inválido! Limite excedido.");
		}
	}

	public double getLimiteCredito() {
		return limiteCredito;
	}
}
