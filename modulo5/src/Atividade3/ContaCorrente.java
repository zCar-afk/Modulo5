package Atividade3;

public class ContaCorrente {
	protected double saldo;

	public ContaCorrente(double saldo) {
		this.saldo = saldo;
	}

	public void depositar(double valor) {
		if (valor > 0) {
			saldo += valor;
			System.out.println("Depósito realizado no valor de :" + valor);
		} else {
			System.out.println("Não foi possível realizar o depósito nesse valor.");
		}
	}

	public double getSaldo() {
		return saldo;
	}

	public void sacar(double valor) {
		if (valor > 0 && valor <= saldo) {
			saldo -= valor;
			System.out.println("Saque realizado no valor de: " + valor);
		} else {
			System.out.println("Saldo insuficiente para saque.");
		}
	}
}
