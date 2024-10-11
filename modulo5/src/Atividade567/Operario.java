package Atividade567;

public class Operario extends Empregado {
	private double valorProducao;
	private double comissao;

	public Operario(String nome, int idade, int codigoSetor, double salarioBase, double imposto, double valorProducao,
			double comissao) {
		super(nome, idade, codigoSetor, salarioBase, imposto);
		this.valorProducao = valorProducao;
		this.comissao = comissao;
	}

	public double getValorProducao() {
		return valorProducao;
	}

	public void setValorProducao(double valorProducao) {
		this.valorProducao = valorProducao;
	}

	public double getComissao() {
		return comissao;
	}

	public void setComissao(double comissao) {
		this.comissao = comissao;
	}

	public double calcularSalario() {

		double salarioBaseLiquido = super.calcularSalario();

		double salarioComComissao = salarioBaseLiquido + (valorProducao * (comissao / 100));

		return salarioComComissao;
	}
}
