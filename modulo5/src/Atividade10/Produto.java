package Atividade10;

public class Produto {

	private String nome;
	private double precoCusto;
	private double precoVenda;
	private double despesas;
	private double margemLucro;

	public Produto(String nome, double precoCusto, double precoVenda, double despesas) {
		this.nome = nome;
		this.precoCusto = precoCusto;
		this.precoVenda = precoVenda;
		this.despesas = despesas;
	}

	public void calculaMargemLucro() {
		margemLucro = ((precoVenda - (precoCusto + despesas)) / precoVenda) * 100;
	}

	public double getMargemLucro() {
		return margemLucro;
	}

	public String getNome() {
		return nome;
	}
}
