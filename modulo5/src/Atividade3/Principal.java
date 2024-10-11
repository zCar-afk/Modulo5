package Atividade3;

public class Principal {
	public static void main(String[] args) {
		ContaEspecial contaEspecial = new ContaEspecial(400.00, 200.00);

		System.out.println("Saldo inicial em reais:  " + contaEspecial.getSaldo());

		contaEspecial.sacar(300.00);

		contaEspecial.sacar(300.00);

		System.out.println("Saldo final em reais:  " + contaEspecial.getSaldo());
	}
}
