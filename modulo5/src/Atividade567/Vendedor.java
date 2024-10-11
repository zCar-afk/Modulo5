package Atividade567;

public class Vendedor extends Empregado {
	private double valorVendas;
	private double comissao;

	public Vendedor(String nome, int idade, int codigoSetor, double salarioBase, double imposto, double valorVendas,
			double comissao) {
		super(nome, idade, codigoSetor, salarioBase, imposto); // Chama o construtor da classe Empregado
		this.valorVendas = valorVendas;
		this.comissao = comissao;
	}

	public double getValorVendas() {
		return valorVendas;
	}

	public void setValorVendas(double valorVendas) {
		this.valorVendas = valorVendas;
	}

	public double getComissao() {
		return comissao;
	}

	public void setComissao(double comissao) {
		this.comissao = comissao;
	}

	public double calcularSalario() {
		double salarioBaseLiquido = super.calcularSalario();

		double salarioComComissao = salarioBaseLiquido + (valorVendas * (comissao / 100));

		return salarioComComissao;
	}
}
